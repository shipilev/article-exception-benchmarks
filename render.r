library(ggplot2);
library(scales);

#freq, 
# .dynamic, 
# .dynamic_chain,
# .dynamic_rethrow, 
# .flags, 
# .static_, 
# .static_rethrow

readA <- function(name) {
  a = read.csv(name, header = FALSE);
  ds = data.frame(
    freq = a$V1/(10^6),
    dynamic = a$V2,
    dynamic_err = a$V3,
    dynamicChain = a$V4,
    dynamicChain_err = a$V5,
    dynamicRethrow = a$V6,
    dynamicRethrow_err = a$V7,
    flags = a$V8,
    flags_err = a$V9,
    static = a$V10,
    static_err = a$V11,
    staticRethrow = a$V12,
    staticRethrow_err = a$V13
  );
}


labels = c(
	"dynamic",
	"dynamicChain",
	"dynamicRethrow",
	"flags",
	"static",
	"staticRethrow"
);

colors = c(
	"dynamic" = "#FFDD00",
	"dynamicChain" = "#FF0000",
	"dynamicRethrow" = "#0000FF",
	"flags" = "#000000",
	"static" = "#00FF00",
	"staticRethrow" = "#00FFAA"
);

hLabels = c(
	"dynamic" = "Dynamic",
	"dynamicChain" = "Dynamic (chained)",
	"dynamicRethrow" = "Dynamic (rethrow)",
	"flags" = "Flags",
	"static" = "Static",
	"staticRethrow" = "Static (rethrow)"
);


g <- function(ds) {
 ggplot() + 
 layer(data = ds, mapping = aes(x = freq, y = dynamic, color="dynamic"), geom="line", geom_params=list(size=2)) +
 layer(data = ds, mapping = aes(x = freq, y = dynamic, ymin = dynamic - dynamic_err, ymax = dynamic + dynamic_err, color="dynamic"), geom="errorbar") + 
 layer(data = ds, mapping = aes(x = freq, y = dynamicChain,  color="dynamicChain"), geom="line", geom_params=list(size=2)) +
 layer(data = ds, mapping = aes(x = freq, y = dynamicChain, ymin = dynamicChain - dynamicChain_err, ymax = dynamicChain + dynamicChain_err, color="dynamicChain"), geom="errorbar") + 
 layer(data = ds, mapping = aes(x = freq, y = dynamicRethrow,  color="dynamicRethrow"), geom="line", geom_params=list(size=2)) +
 layer(data = ds, mapping = aes(x = freq, y = dynamicRethrow, ymin = dynamicRethrow - dynamicRethrow_err, ymax = dynamicRethrow + dynamicRethrow_err, color="dynamicRethrow"), geom="errorbar") + 
 layer(data = ds, mapping = aes(x = freq, y = flags,  color="flags"), geom="line", geom_params=list(size=2)) +
 layer(data = ds, mapping = aes(x = freq, y = flags, ymin = flags - flags_err, ymax = flags + flags_err, color="flags"), geom="errorbar") + 
 layer(data = ds, mapping = aes(x = freq, y = static,  color="static"), geom="line", geom_params=list(size=2)) +
 layer(data = ds, mapping = aes(x = freq, y = static, ymin = static - static_err, ymax = static + static_err, color="static"), geom="errorbar") + 
 layer(data = ds, mapping = aes(x = freq, y = static,  color="staticRethrow"), geom="line", geom_params=list(size=2)) +
 layer(data = ds, mapping = aes(x = freq, y = static, ymin = staticRethrow - staticRethrow_err, ymax = staticRethrow + staticRethrow_err, color="staticRethrow"), geom="errorbar") + 
 scale_colour_manual("", breaks = labels, labels = hLabels, values = colors) +
 labs(x = "exceptional frequency", y = "execution time, ns per call") +
 theme_bw() +
 theme(axis.text.x = element_text(colour="grey20",size=16,face="plain"),
       axis.text.y = element_text(colour="grey20",size=16,face="plain"),
       axis.title.x = element_text(colour="grey20",size=16,face="plain"),
       axis.title.y = element_text(colour="grey20",size=16,face="plain"),
       legend.text = element_text(colour="grey20",size=16,face="plain"),
       title       = element_text(colour="grey20",size=16,face="plain")
       ) + 
 opts(legend.position = "bottom", legend.direction="horizontal", title = "")
}

# ---- RENDER ----

svg(file="exceptions-baseline-full.svg", width = 12, height = 6, family = "serif")

g(readA("baseline.csv")) +
 scale_x_log10(limits = c(10^-6, 10^-0), breaks=c(10^-6, 10^-5, 10^-4, 10^-3, 10^-2, 10^-1, 10^0), labels = trans_format('log10', math_format(10^.x))) + 
 scale_y_log10(limits = c(10, 40000), breaks=c(1, 10, 100, 1000, 10000), labels = trans_format('log10', math_format(10^.x)))

svg(file="exceptions-baseline-focused.svg", width = 12, height = 6, family = "serif")

g(readA("baseline.csv")) +
 scale_x_log10(limits = c(10^-6, 10^-0), breaks=c(10^-6, 10^-5, 10^-4, 10^-3, 10^-2, 10^-1, 10^0), labels = trans_format('log10', math_format(10^.x))) + 
 scale_y_continuous(limits = c(15, 38))



svg(file="exceptions-noinline-full.svg", width = 12, height = 6, family = "serif")

g(readA("noinline.csv")) +
 scale_x_log10(limits = c(10^-6, 10^-0), breaks=c(10^-6, 10^-5, 10^-4, 10^-3, 10^-2, 10^-1, 10^0), labels = trans_format('log10', math_format(10^.x))) + 
 scale_y_log10(limits = c(10, 40000), breaks=c(1, 10, 100, 1000, 10000), labels = trans_format('log10', math_format(10^.x)))

svg(file="exceptions-noinline-focused.svg", width = 12, height = 6, family = "serif")

g(readA("noinline.csv")) +
 scale_x_log10(limits = c(10^-6, 10^-0), breaks=c(10^-6, 10^-5, 10^-4, 10^-3, 10^-2, 10^-1, 10^0), labels = trans_format('log10', math_format(10^.x))) + 
 scale_y_continuous(limits = c(130, 200))


svg(file="exceptions-maxinline-full.svg", width = 12, height = 6, family = "serif")

g(readA("maxinline.csv")) +
 scale_x_log10(limits = c(10^-6, 10^-0), breaks=c(10^-6, 10^-5, 10^-4, 10^-3, 10^-2, 10^-1, 10^0), labels = trans_format('log10', math_format(10^.x))) + 
 scale_y_log10(limits = c(10, 40000), breaks=c(1, 10, 100, 1000, 10000), labels = trans_format('log10', math_format(10^.x)))

svg(file="exceptions-maxinline-focused.svg", width = 12, height = 6, family = "serif")

g(readA("maxinline.csv")) +
 scale_x_log10(limits = c(10^-6, 10^-0), breaks=c(10^-6, 10^-5, 10^-4, 10^-3, 10^-2, 10^-1, 10^0), labels = trans_format('log10', math_format(10^.x))) + 
 scale_y_continuous(limits = c(15, 38))


