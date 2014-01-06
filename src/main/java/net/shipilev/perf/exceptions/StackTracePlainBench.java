package net.shipilev.perf.exceptions;

import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.GenerateMicroBenchmark;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@State(Scope.Thread)
public class StackTracePlainBench {

    Integer source = 42;

    @GenerateMicroBenchmark
    public Object exception_0000() {
        return call0(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0000() {
        return call0(false);
    }

    @GenerateMicroBenchmark
    public Object exception_0001() {
        return call1(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0001() {
        return call1(false);
    }

    @GenerateMicroBenchmark
    public Object exception_0002() {
        return call2(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0002() {
        return call2(false);
    }

    @GenerateMicroBenchmark
    public Object exception_0004() {
        return call4(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0004() {
        return call4(false);
    }

    @GenerateMicroBenchmark
    public Object exception_0008() {
        return call8(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0008() {
        return call8(false);
    }

    @GenerateMicroBenchmark
    public Object exception_0016() {
        return call16(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0016() {
        return call16(false);
    }

    @GenerateMicroBenchmark
    public Object exception_0032() {
        return call32(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0032() {
        return call32(false);
    }

    @GenerateMicroBenchmark
    public Object exception_0064() {
        return call64(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0064() {
        return call64(false);
    }

    @GenerateMicroBenchmark
    public Object exception_0128() {
        return call128(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0128() {
        return call128(false);
    }

    @GenerateMicroBenchmark
    public Object exception_0256() {
        return call256(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0256() {
        return call256(false);
    }

    @GenerateMicroBenchmark
    public Object exception_0512() {
        return call512(true);
    }

    @GenerateMicroBenchmark
    public Object returned_0512() {
        return call512(false);
    }

    @GenerateMicroBenchmark
    public Object exception_1024() {
        return call1024(true);
    }

    @GenerateMicroBenchmark
    public Object returned_1024() {
        return call1024(false);
    }
    public Object call0(boolean except) { return finalCall(except); }
    public Object call1(boolean except) { return call0(except); }
    public Object call2(boolean except) { return call1(except); }
    public Object call3(boolean except) { return call2(except); }
    public Object call4(boolean except) { return call3(except); }
    public Object call5(boolean except) { return call4(except); }
    public Object call6(boolean except) { return call5(except); }
    public Object call7(boolean except) { return call6(except); }
    public Object call8(boolean except) { return call7(except); }
    public Object call9(boolean except) { return call8(except); }
    public Object call10(boolean except) { return call9(except); }
    public Object call11(boolean except) { return call10(except); }
    public Object call12(boolean except) { return call11(except); }
    public Object call13(boolean except) { return call12(except); }
    public Object call14(boolean except) { return call13(except); }
    public Object call15(boolean except) { return call14(except); }
    public Object call16(boolean except) { return call15(except); }
    public Object call17(boolean except) { return call16(except); }
    public Object call18(boolean except) { return call17(except); }
    public Object call19(boolean except) { return call18(except); }
    public Object call20(boolean except) { return call19(except); }
    public Object call21(boolean except) { return call20(except); }
    public Object call22(boolean except) { return call21(except); }
    public Object call23(boolean except) { return call22(except); }
    public Object call24(boolean except) { return call23(except); }
    public Object call25(boolean except) { return call24(except); }
    public Object call26(boolean except) { return call25(except); }
    public Object call27(boolean except) { return call26(except); }
    public Object call28(boolean except) { return call27(except); }
    public Object call29(boolean except) { return call28(except); }
    public Object call30(boolean except) { return call29(except); }
    public Object call31(boolean except) { return call30(except); }
    public Object call32(boolean except) { return call31(except); }
    public Object call33(boolean except) { return call32(except); }
    public Object call34(boolean except) { return call33(except); }
    public Object call35(boolean except) { return call34(except); }
    public Object call36(boolean except) { return call35(except); }
    public Object call37(boolean except) { return call36(except); }
    public Object call38(boolean except) { return call37(except); }
    public Object call39(boolean except) { return call38(except); }
    public Object call40(boolean except) { return call39(except); }
    public Object call41(boolean except) { return call40(except); }
    public Object call42(boolean except) { return call41(except); }
    public Object call43(boolean except) { return call42(except); }
    public Object call44(boolean except) { return call43(except); }
    public Object call45(boolean except) { return call44(except); }
    public Object call46(boolean except) { return call45(except); }
    public Object call47(boolean except) { return call46(except); }
    public Object call48(boolean except) { return call47(except); }
    public Object call49(boolean except) { return call48(except); }
    public Object call50(boolean except) { return call49(except); }
    public Object call51(boolean except) { return call50(except); }
    public Object call52(boolean except) { return call51(except); }
    public Object call53(boolean except) { return call52(except); }
    public Object call54(boolean except) { return call53(except); }
    public Object call55(boolean except) { return call54(except); }
    public Object call56(boolean except) { return call55(except); }
    public Object call57(boolean except) { return call56(except); }
    public Object call58(boolean except) { return call57(except); }
    public Object call59(boolean except) { return call58(except); }
    public Object call60(boolean except) { return call59(except); }
    public Object call61(boolean except) { return call60(except); }
    public Object call62(boolean except) { return call61(except); }
    public Object call63(boolean except) { return call62(except); }
    public Object call64(boolean except) { return call63(except); }
    public Object call65(boolean except) { return call64(except); }
    public Object call66(boolean except) { return call65(except); }
    public Object call67(boolean except) { return call66(except); }
    public Object call68(boolean except) { return call67(except); }
    public Object call69(boolean except) { return call68(except); }
    public Object call70(boolean except) { return call69(except); }
    public Object call71(boolean except) { return call70(except); }
    public Object call72(boolean except) { return call71(except); }
    public Object call73(boolean except) { return call72(except); }
    public Object call74(boolean except) { return call73(except); }
    public Object call75(boolean except) { return call74(except); }
    public Object call76(boolean except) { return call75(except); }
    public Object call77(boolean except) { return call76(except); }
    public Object call78(boolean except) { return call77(except); }
    public Object call79(boolean except) { return call78(except); }
    public Object call80(boolean except) { return call79(except); }
    public Object call81(boolean except) { return call80(except); }
    public Object call82(boolean except) { return call81(except); }
    public Object call83(boolean except) { return call82(except); }
    public Object call84(boolean except) { return call83(except); }
    public Object call85(boolean except) { return call84(except); }
    public Object call86(boolean except) { return call85(except); }
    public Object call87(boolean except) { return call86(except); }
    public Object call88(boolean except) { return call87(except); }
    public Object call89(boolean except) { return call88(except); }
    public Object call90(boolean except) { return call89(except); }
    public Object call91(boolean except) { return call90(except); }
    public Object call92(boolean except) { return call91(except); }
    public Object call93(boolean except) { return call92(except); }
    public Object call94(boolean except) { return call93(except); }
    public Object call95(boolean except) { return call94(except); }
    public Object call96(boolean except) { return call95(except); }
    public Object call97(boolean except) { return call96(except); }
    public Object call98(boolean except) { return call97(except); }
    public Object call99(boolean except) { return call98(except); }
    public Object call100(boolean except) { return call99(except); }
    public Object call101(boolean except) { return call100(except); }
    public Object call102(boolean except) { return call101(except); }
    public Object call103(boolean except) { return call102(except); }
    public Object call104(boolean except) { return call103(except); }
    public Object call105(boolean except) { return call104(except); }
    public Object call106(boolean except) { return call105(except); }
    public Object call107(boolean except) { return call106(except); }
    public Object call108(boolean except) { return call107(except); }
    public Object call109(boolean except) { return call108(except); }
    public Object call110(boolean except) { return call109(except); }
    public Object call111(boolean except) { return call110(except); }
    public Object call112(boolean except) { return call111(except); }
    public Object call113(boolean except) { return call112(except); }
    public Object call114(boolean except) { return call113(except); }
    public Object call115(boolean except) { return call114(except); }
    public Object call116(boolean except) { return call115(except); }
    public Object call117(boolean except) { return call116(except); }
    public Object call118(boolean except) { return call117(except); }
    public Object call119(boolean except) { return call118(except); }
    public Object call120(boolean except) { return call119(except); }
    public Object call121(boolean except) { return call120(except); }
    public Object call122(boolean except) { return call121(except); }
    public Object call123(boolean except) { return call122(except); }
    public Object call124(boolean except) { return call123(except); }
    public Object call125(boolean except) { return call124(except); }
    public Object call126(boolean except) { return call125(except); }
    public Object call127(boolean except) { return call126(except); }
    public Object call128(boolean except) { return call127(except); }
    public Object call129(boolean except) { return call128(except); }
    public Object call130(boolean except) { return call129(except); }
    public Object call131(boolean except) { return call130(except); }
    public Object call132(boolean except) { return call131(except); }
    public Object call133(boolean except) { return call132(except); }
    public Object call134(boolean except) { return call133(except); }
    public Object call135(boolean except) { return call134(except); }
    public Object call136(boolean except) { return call135(except); }
    public Object call137(boolean except) { return call136(except); }
    public Object call138(boolean except) { return call137(except); }
    public Object call139(boolean except) { return call138(except); }
    public Object call140(boolean except) { return call139(except); }
    public Object call141(boolean except) { return call140(except); }
    public Object call142(boolean except) { return call141(except); }
    public Object call143(boolean except) { return call142(except); }
    public Object call144(boolean except) { return call143(except); }
    public Object call145(boolean except) { return call144(except); }
    public Object call146(boolean except) { return call145(except); }
    public Object call147(boolean except) { return call146(except); }
    public Object call148(boolean except) { return call147(except); }
    public Object call149(boolean except) { return call148(except); }
    public Object call150(boolean except) { return call149(except); }
    public Object call151(boolean except) { return call150(except); }
    public Object call152(boolean except) { return call151(except); }
    public Object call153(boolean except) { return call152(except); }
    public Object call154(boolean except) { return call153(except); }
    public Object call155(boolean except) { return call154(except); }
    public Object call156(boolean except) { return call155(except); }
    public Object call157(boolean except) { return call156(except); }
    public Object call158(boolean except) { return call157(except); }
    public Object call159(boolean except) { return call158(except); }
    public Object call160(boolean except) { return call159(except); }
    public Object call161(boolean except) { return call160(except); }
    public Object call162(boolean except) { return call161(except); }
    public Object call163(boolean except) { return call162(except); }
    public Object call164(boolean except) { return call163(except); }
    public Object call165(boolean except) { return call164(except); }
    public Object call166(boolean except) { return call165(except); }
    public Object call167(boolean except) { return call166(except); }
    public Object call168(boolean except) { return call167(except); }
    public Object call169(boolean except) { return call168(except); }
    public Object call170(boolean except) { return call169(except); }
    public Object call171(boolean except) { return call170(except); }
    public Object call172(boolean except) { return call171(except); }
    public Object call173(boolean except) { return call172(except); }
    public Object call174(boolean except) { return call173(except); }
    public Object call175(boolean except) { return call174(except); }
    public Object call176(boolean except) { return call175(except); }
    public Object call177(boolean except) { return call176(except); }
    public Object call178(boolean except) { return call177(except); }
    public Object call179(boolean except) { return call178(except); }
    public Object call180(boolean except) { return call179(except); }
    public Object call181(boolean except) { return call180(except); }
    public Object call182(boolean except) { return call181(except); }
    public Object call183(boolean except) { return call182(except); }
    public Object call184(boolean except) { return call183(except); }
    public Object call185(boolean except) { return call184(except); }
    public Object call186(boolean except) { return call185(except); }
    public Object call187(boolean except) { return call186(except); }
    public Object call188(boolean except) { return call187(except); }
    public Object call189(boolean except) { return call188(except); }
    public Object call190(boolean except) { return call189(except); }
    public Object call191(boolean except) { return call190(except); }
    public Object call192(boolean except) { return call191(except); }
    public Object call193(boolean except) { return call192(except); }
    public Object call194(boolean except) { return call193(except); }
    public Object call195(boolean except) { return call194(except); }
    public Object call196(boolean except) { return call195(except); }
    public Object call197(boolean except) { return call196(except); }
    public Object call198(boolean except) { return call197(except); }
    public Object call199(boolean except) { return call198(except); }
    public Object call200(boolean except) { return call199(except); }
    public Object call201(boolean except) { return call200(except); }
    public Object call202(boolean except) { return call201(except); }
    public Object call203(boolean except) { return call202(except); }
    public Object call204(boolean except) { return call203(except); }
    public Object call205(boolean except) { return call204(except); }
    public Object call206(boolean except) { return call205(except); }
    public Object call207(boolean except) { return call206(except); }
    public Object call208(boolean except) { return call207(except); }
    public Object call209(boolean except) { return call208(except); }
    public Object call210(boolean except) { return call209(except); }
    public Object call211(boolean except) { return call210(except); }
    public Object call212(boolean except) { return call211(except); }
    public Object call213(boolean except) { return call212(except); }
    public Object call214(boolean except) { return call213(except); }
    public Object call215(boolean except) { return call214(except); }
    public Object call216(boolean except) { return call215(except); }
    public Object call217(boolean except) { return call216(except); }
    public Object call218(boolean except) { return call217(except); }
    public Object call219(boolean except) { return call218(except); }
    public Object call220(boolean except) { return call219(except); }
    public Object call221(boolean except) { return call220(except); }
    public Object call222(boolean except) { return call221(except); }
    public Object call223(boolean except) { return call222(except); }
    public Object call224(boolean except) { return call223(except); }
    public Object call225(boolean except) { return call224(except); }
    public Object call226(boolean except) { return call225(except); }
    public Object call227(boolean except) { return call226(except); }
    public Object call228(boolean except) { return call227(except); }
    public Object call229(boolean except) { return call228(except); }
    public Object call230(boolean except) { return call229(except); }
    public Object call231(boolean except) { return call230(except); }
    public Object call232(boolean except) { return call231(except); }
    public Object call233(boolean except) { return call232(except); }
    public Object call234(boolean except) { return call233(except); }
    public Object call235(boolean except) { return call234(except); }
    public Object call236(boolean except) { return call235(except); }
    public Object call237(boolean except) { return call236(except); }
    public Object call238(boolean except) { return call237(except); }
    public Object call239(boolean except) { return call238(except); }
    public Object call240(boolean except) { return call239(except); }
    public Object call241(boolean except) { return call240(except); }
    public Object call242(boolean except) { return call241(except); }
    public Object call243(boolean except) { return call242(except); }
    public Object call244(boolean except) { return call243(except); }
    public Object call245(boolean except) { return call244(except); }
    public Object call246(boolean except) { return call245(except); }
    public Object call247(boolean except) { return call246(except); }
    public Object call248(boolean except) { return call247(except); }
    public Object call249(boolean except) { return call248(except); }
    public Object call250(boolean except) { return call249(except); }
    public Object call251(boolean except) { return call250(except); }
    public Object call252(boolean except) { return call251(except); }
    public Object call253(boolean except) { return call252(except); }
    public Object call254(boolean except) { return call253(except); }
    public Object call255(boolean except) { return call254(except); }
    public Object call256(boolean except) { return call255(except); }
    public Object call257(boolean except) { return call256(except); }
    public Object call258(boolean except) { return call257(except); }
    public Object call259(boolean except) { return call258(except); }
    public Object call260(boolean except) { return call259(except); }
    public Object call261(boolean except) { return call260(except); }
    public Object call262(boolean except) { return call261(except); }
    public Object call263(boolean except) { return call262(except); }
    public Object call264(boolean except) { return call263(except); }
    public Object call265(boolean except) { return call264(except); }
    public Object call266(boolean except) { return call265(except); }
    public Object call267(boolean except) { return call266(except); }
    public Object call268(boolean except) { return call267(except); }
    public Object call269(boolean except) { return call268(except); }
    public Object call270(boolean except) { return call269(except); }
    public Object call271(boolean except) { return call270(except); }
    public Object call272(boolean except) { return call271(except); }
    public Object call273(boolean except) { return call272(except); }
    public Object call274(boolean except) { return call273(except); }
    public Object call275(boolean except) { return call274(except); }
    public Object call276(boolean except) { return call275(except); }
    public Object call277(boolean except) { return call276(except); }
    public Object call278(boolean except) { return call277(except); }
    public Object call279(boolean except) { return call278(except); }
    public Object call280(boolean except) { return call279(except); }
    public Object call281(boolean except) { return call280(except); }
    public Object call282(boolean except) { return call281(except); }
    public Object call283(boolean except) { return call282(except); }
    public Object call284(boolean except) { return call283(except); }
    public Object call285(boolean except) { return call284(except); }
    public Object call286(boolean except) { return call285(except); }
    public Object call287(boolean except) { return call286(except); }
    public Object call288(boolean except) { return call287(except); }
    public Object call289(boolean except) { return call288(except); }
    public Object call290(boolean except) { return call289(except); }
    public Object call291(boolean except) { return call290(except); }
    public Object call292(boolean except) { return call291(except); }
    public Object call293(boolean except) { return call292(except); }
    public Object call294(boolean except) { return call293(except); }
    public Object call295(boolean except) { return call294(except); }
    public Object call296(boolean except) { return call295(except); }
    public Object call297(boolean except) { return call296(except); }
    public Object call298(boolean except) { return call297(except); }
    public Object call299(boolean except) { return call298(except); }
    public Object call300(boolean except) { return call299(except); }
    public Object call301(boolean except) { return call300(except); }
    public Object call302(boolean except) { return call301(except); }
    public Object call303(boolean except) { return call302(except); }
    public Object call304(boolean except) { return call303(except); }
    public Object call305(boolean except) { return call304(except); }
    public Object call306(boolean except) { return call305(except); }
    public Object call307(boolean except) { return call306(except); }
    public Object call308(boolean except) { return call307(except); }
    public Object call309(boolean except) { return call308(except); }
    public Object call310(boolean except) { return call309(except); }
    public Object call311(boolean except) { return call310(except); }
    public Object call312(boolean except) { return call311(except); }
    public Object call313(boolean except) { return call312(except); }
    public Object call314(boolean except) { return call313(except); }
    public Object call315(boolean except) { return call314(except); }
    public Object call316(boolean except) { return call315(except); }
    public Object call317(boolean except) { return call316(except); }
    public Object call318(boolean except) { return call317(except); }
    public Object call319(boolean except) { return call318(except); }
    public Object call320(boolean except) { return call319(except); }
    public Object call321(boolean except) { return call320(except); }
    public Object call322(boolean except) { return call321(except); }
    public Object call323(boolean except) { return call322(except); }
    public Object call324(boolean except) { return call323(except); }
    public Object call325(boolean except) { return call324(except); }
    public Object call326(boolean except) { return call325(except); }
    public Object call327(boolean except) { return call326(except); }
    public Object call328(boolean except) { return call327(except); }
    public Object call329(boolean except) { return call328(except); }
    public Object call330(boolean except) { return call329(except); }
    public Object call331(boolean except) { return call330(except); }
    public Object call332(boolean except) { return call331(except); }
    public Object call333(boolean except) { return call332(except); }
    public Object call334(boolean except) { return call333(except); }
    public Object call335(boolean except) { return call334(except); }
    public Object call336(boolean except) { return call335(except); }
    public Object call337(boolean except) { return call336(except); }
    public Object call338(boolean except) { return call337(except); }
    public Object call339(boolean except) { return call338(except); }
    public Object call340(boolean except) { return call339(except); }
    public Object call341(boolean except) { return call340(except); }
    public Object call342(boolean except) { return call341(except); }
    public Object call343(boolean except) { return call342(except); }
    public Object call344(boolean except) { return call343(except); }
    public Object call345(boolean except) { return call344(except); }
    public Object call346(boolean except) { return call345(except); }
    public Object call347(boolean except) { return call346(except); }
    public Object call348(boolean except) { return call347(except); }
    public Object call349(boolean except) { return call348(except); }
    public Object call350(boolean except) { return call349(except); }
    public Object call351(boolean except) { return call350(except); }
    public Object call352(boolean except) { return call351(except); }
    public Object call353(boolean except) { return call352(except); }
    public Object call354(boolean except) { return call353(except); }
    public Object call355(boolean except) { return call354(except); }
    public Object call356(boolean except) { return call355(except); }
    public Object call357(boolean except) { return call356(except); }
    public Object call358(boolean except) { return call357(except); }
    public Object call359(boolean except) { return call358(except); }
    public Object call360(boolean except) { return call359(except); }
    public Object call361(boolean except) { return call360(except); }
    public Object call362(boolean except) { return call361(except); }
    public Object call363(boolean except) { return call362(except); }
    public Object call364(boolean except) { return call363(except); }
    public Object call365(boolean except) { return call364(except); }
    public Object call366(boolean except) { return call365(except); }
    public Object call367(boolean except) { return call366(except); }
    public Object call368(boolean except) { return call367(except); }
    public Object call369(boolean except) { return call368(except); }
    public Object call370(boolean except) { return call369(except); }
    public Object call371(boolean except) { return call370(except); }
    public Object call372(boolean except) { return call371(except); }
    public Object call373(boolean except) { return call372(except); }
    public Object call374(boolean except) { return call373(except); }
    public Object call375(boolean except) { return call374(except); }
    public Object call376(boolean except) { return call375(except); }
    public Object call377(boolean except) { return call376(except); }
    public Object call378(boolean except) { return call377(except); }
    public Object call379(boolean except) { return call378(except); }
    public Object call380(boolean except) { return call379(except); }
    public Object call381(boolean except) { return call380(except); }
    public Object call382(boolean except) { return call381(except); }
    public Object call383(boolean except) { return call382(except); }
    public Object call384(boolean except) { return call383(except); }
    public Object call385(boolean except) { return call384(except); }
    public Object call386(boolean except) { return call385(except); }
    public Object call387(boolean except) { return call386(except); }
    public Object call388(boolean except) { return call387(except); }
    public Object call389(boolean except) { return call388(except); }
    public Object call390(boolean except) { return call389(except); }
    public Object call391(boolean except) { return call390(except); }
    public Object call392(boolean except) { return call391(except); }
    public Object call393(boolean except) { return call392(except); }
    public Object call394(boolean except) { return call393(except); }
    public Object call395(boolean except) { return call394(except); }
    public Object call396(boolean except) { return call395(except); }
    public Object call397(boolean except) { return call396(except); }
    public Object call398(boolean except) { return call397(except); }
    public Object call399(boolean except) { return call398(except); }
    public Object call400(boolean except) { return call399(except); }
    public Object call401(boolean except) { return call400(except); }
    public Object call402(boolean except) { return call401(except); }
    public Object call403(boolean except) { return call402(except); }
    public Object call404(boolean except) { return call403(except); }
    public Object call405(boolean except) { return call404(except); }
    public Object call406(boolean except) { return call405(except); }
    public Object call407(boolean except) { return call406(except); }
    public Object call408(boolean except) { return call407(except); }
    public Object call409(boolean except) { return call408(except); }
    public Object call410(boolean except) { return call409(except); }
    public Object call411(boolean except) { return call410(except); }
    public Object call412(boolean except) { return call411(except); }
    public Object call413(boolean except) { return call412(except); }
    public Object call414(boolean except) { return call413(except); }
    public Object call415(boolean except) { return call414(except); }
    public Object call416(boolean except) { return call415(except); }
    public Object call417(boolean except) { return call416(except); }
    public Object call418(boolean except) { return call417(except); }
    public Object call419(boolean except) { return call418(except); }
    public Object call420(boolean except) { return call419(except); }
    public Object call421(boolean except) { return call420(except); }
    public Object call422(boolean except) { return call421(except); }
    public Object call423(boolean except) { return call422(except); }
    public Object call424(boolean except) { return call423(except); }
    public Object call425(boolean except) { return call424(except); }
    public Object call426(boolean except) { return call425(except); }
    public Object call427(boolean except) { return call426(except); }
    public Object call428(boolean except) { return call427(except); }
    public Object call429(boolean except) { return call428(except); }
    public Object call430(boolean except) { return call429(except); }
    public Object call431(boolean except) { return call430(except); }
    public Object call432(boolean except) { return call431(except); }
    public Object call433(boolean except) { return call432(except); }
    public Object call434(boolean except) { return call433(except); }
    public Object call435(boolean except) { return call434(except); }
    public Object call436(boolean except) { return call435(except); }
    public Object call437(boolean except) { return call436(except); }
    public Object call438(boolean except) { return call437(except); }
    public Object call439(boolean except) { return call438(except); }
    public Object call440(boolean except) { return call439(except); }
    public Object call441(boolean except) { return call440(except); }
    public Object call442(boolean except) { return call441(except); }
    public Object call443(boolean except) { return call442(except); }
    public Object call444(boolean except) { return call443(except); }
    public Object call445(boolean except) { return call444(except); }
    public Object call446(boolean except) { return call445(except); }
    public Object call447(boolean except) { return call446(except); }
    public Object call448(boolean except) { return call447(except); }
    public Object call449(boolean except) { return call448(except); }
    public Object call450(boolean except) { return call449(except); }
    public Object call451(boolean except) { return call450(except); }
    public Object call452(boolean except) { return call451(except); }
    public Object call453(boolean except) { return call452(except); }
    public Object call454(boolean except) { return call453(except); }
    public Object call455(boolean except) { return call454(except); }
    public Object call456(boolean except) { return call455(except); }
    public Object call457(boolean except) { return call456(except); }
    public Object call458(boolean except) { return call457(except); }
    public Object call459(boolean except) { return call458(except); }
    public Object call460(boolean except) { return call459(except); }
    public Object call461(boolean except) { return call460(except); }
    public Object call462(boolean except) { return call461(except); }
    public Object call463(boolean except) { return call462(except); }
    public Object call464(boolean except) { return call463(except); }
    public Object call465(boolean except) { return call464(except); }
    public Object call466(boolean except) { return call465(except); }
    public Object call467(boolean except) { return call466(except); }
    public Object call468(boolean except) { return call467(except); }
    public Object call469(boolean except) { return call468(except); }
    public Object call470(boolean except) { return call469(except); }
    public Object call471(boolean except) { return call470(except); }
    public Object call472(boolean except) { return call471(except); }
    public Object call473(boolean except) { return call472(except); }
    public Object call474(boolean except) { return call473(except); }
    public Object call475(boolean except) { return call474(except); }
    public Object call476(boolean except) { return call475(except); }
    public Object call477(boolean except) { return call476(except); }
    public Object call478(boolean except) { return call477(except); }
    public Object call479(boolean except) { return call478(except); }
    public Object call480(boolean except) { return call479(except); }
    public Object call481(boolean except) { return call480(except); }
    public Object call482(boolean except) { return call481(except); }
    public Object call483(boolean except) { return call482(except); }
    public Object call484(boolean except) { return call483(except); }
    public Object call485(boolean except) { return call484(except); }
    public Object call486(boolean except) { return call485(except); }
    public Object call487(boolean except) { return call486(except); }
    public Object call488(boolean except) { return call487(except); }
    public Object call489(boolean except) { return call488(except); }
    public Object call490(boolean except) { return call489(except); }
    public Object call491(boolean except) { return call490(except); }
    public Object call492(boolean except) { return call491(except); }
    public Object call493(boolean except) { return call492(except); }
    public Object call494(boolean except) { return call493(except); }
    public Object call495(boolean except) { return call494(except); }
    public Object call496(boolean except) { return call495(except); }
    public Object call497(boolean except) { return call496(except); }
    public Object call498(boolean except) { return call497(except); }
    public Object call499(boolean except) { return call498(except); }
    public Object call500(boolean except) { return call499(except); }
    public Object call501(boolean except) { return call500(except); }
    public Object call502(boolean except) { return call501(except); }
    public Object call503(boolean except) { return call502(except); }
    public Object call504(boolean except) { return call503(except); }
    public Object call505(boolean except) { return call504(except); }
    public Object call506(boolean except) { return call505(except); }
    public Object call507(boolean except) { return call506(except); }
    public Object call508(boolean except) { return call507(except); }
    public Object call509(boolean except) { return call508(except); }
    public Object call510(boolean except) { return call509(except); }
    public Object call511(boolean except) { return call510(except); }
    public Object call512(boolean except) { return call511(except); }
    public Object call513(boolean except) { return call512(except); }
    public Object call514(boolean except) { return call513(except); }
    public Object call515(boolean except) { return call514(except); }
    public Object call516(boolean except) { return call515(except); }
    public Object call517(boolean except) { return call516(except); }
    public Object call518(boolean except) { return call517(except); }
    public Object call519(boolean except) { return call518(except); }
    public Object call520(boolean except) { return call519(except); }
    public Object call521(boolean except) { return call520(except); }
    public Object call522(boolean except) { return call521(except); }
    public Object call523(boolean except) { return call522(except); }
    public Object call524(boolean except) { return call523(except); }
    public Object call525(boolean except) { return call524(except); }
    public Object call526(boolean except) { return call525(except); }
    public Object call527(boolean except) { return call526(except); }
    public Object call528(boolean except) { return call527(except); }
    public Object call529(boolean except) { return call528(except); }
    public Object call530(boolean except) { return call529(except); }
    public Object call531(boolean except) { return call530(except); }
    public Object call532(boolean except) { return call531(except); }
    public Object call533(boolean except) { return call532(except); }
    public Object call534(boolean except) { return call533(except); }
    public Object call535(boolean except) { return call534(except); }
    public Object call536(boolean except) { return call535(except); }
    public Object call537(boolean except) { return call536(except); }
    public Object call538(boolean except) { return call537(except); }
    public Object call539(boolean except) { return call538(except); }
    public Object call540(boolean except) { return call539(except); }
    public Object call541(boolean except) { return call540(except); }
    public Object call542(boolean except) { return call541(except); }
    public Object call543(boolean except) { return call542(except); }
    public Object call544(boolean except) { return call543(except); }
    public Object call545(boolean except) { return call544(except); }
    public Object call546(boolean except) { return call545(except); }
    public Object call547(boolean except) { return call546(except); }
    public Object call548(boolean except) { return call547(except); }
    public Object call549(boolean except) { return call548(except); }
    public Object call550(boolean except) { return call549(except); }
    public Object call551(boolean except) { return call550(except); }
    public Object call552(boolean except) { return call551(except); }
    public Object call553(boolean except) { return call552(except); }
    public Object call554(boolean except) { return call553(except); }
    public Object call555(boolean except) { return call554(except); }
    public Object call556(boolean except) { return call555(except); }
    public Object call557(boolean except) { return call556(except); }
    public Object call558(boolean except) { return call557(except); }
    public Object call559(boolean except) { return call558(except); }
    public Object call560(boolean except) { return call559(except); }
    public Object call561(boolean except) { return call560(except); }
    public Object call562(boolean except) { return call561(except); }
    public Object call563(boolean except) { return call562(except); }
    public Object call564(boolean except) { return call563(except); }
    public Object call565(boolean except) { return call564(except); }
    public Object call566(boolean except) { return call565(except); }
    public Object call567(boolean except) { return call566(except); }
    public Object call568(boolean except) { return call567(except); }
    public Object call569(boolean except) { return call568(except); }
    public Object call570(boolean except) { return call569(except); }
    public Object call571(boolean except) { return call570(except); }
    public Object call572(boolean except) { return call571(except); }
    public Object call573(boolean except) { return call572(except); }
    public Object call574(boolean except) { return call573(except); }
    public Object call575(boolean except) { return call574(except); }
    public Object call576(boolean except) { return call575(except); }
    public Object call577(boolean except) { return call576(except); }
    public Object call578(boolean except) { return call577(except); }
    public Object call579(boolean except) { return call578(except); }
    public Object call580(boolean except) { return call579(except); }
    public Object call581(boolean except) { return call580(except); }
    public Object call582(boolean except) { return call581(except); }
    public Object call583(boolean except) { return call582(except); }
    public Object call584(boolean except) { return call583(except); }
    public Object call585(boolean except) { return call584(except); }
    public Object call586(boolean except) { return call585(except); }
    public Object call587(boolean except) { return call586(except); }
    public Object call588(boolean except) { return call587(except); }
    public Object call589(boolean except) { return call588(except); }
    public Object call590(boolean except) { return call589(except); }
    public Object call591(boolean except) { return call590(except); }
    public Object call592(boolean except) { return call591(except); }
    public Object call593(boolean except) { return call592(except); }
    public Object call594(boolean except) { return call593(except); }
    public Object call595(boolean except) { return call594(except); }
    public Object call596(boolean except) { return call595(except); }
    public Object call597(boolean except) { return call596(except); }
    public Object call598(boolean except) { return call597(except); }
    public Object call599(boolean except) { return call598(except); }
    public Object call600(boolean except) { return call599(except); }
    public Object call601(boolean except) { return call600(except); }
    public Object call602(boolean except) { return call601(except); }
    public Object call603(boolean except) { return call602(except); }
    public Object call604(boolean except) { return call603(except); }
    public Object call605(boolean except) { return call604(except); }
    public Object call606(boolean except) { return call605(except); }
    public Object call607(boolean except) { return call606(except); }
    public Object call608(boolean except) { return call607(except); }
    public Object call609(boolean except) { return call608(except); }
    public Object call610(boolean except) { return call609(except); }
    public Object call611(boolean except) { return call610(except); }
    public Object call612(boolean except) { return call611(except); }
    public Object call613(boolean except) { return call612(except); }
    public Object call614(boolean except) { return call613(except); }
    public Object call615(boolean except) { return call614(except); }
    public Object call616(boolean except) { return call615(except); }
    public Object call617(boolean except) { return call616(except); }
    public Object call618(boolean except) { return call617(except); }
    public Object call619(boolean except) { return call618(except); }
    public Object call620(boolean except) { return call619(except); }
    public Object call621(boolean except) { return call620(except); }
    public Object call622(boolean except) { return call621(except); }
    public Object call623(boolean except) { return call622(except); }
    public Object call624(boolean except) { return call623(except); }
    public Object call625(boolean except) { return call624(except); }
    public Object call626(boolean except) { return call625(except); }
    public Object call627(boolean except) { return call626(except); }
    public Object call628(boolean except) { return call627(except); }
    public Object call629(boolean except) { return call628(except); }
    public Object call630(boolean except) { return call629(except); }
    public Object call631(boolean except) { return call630(except); }
    public Object call632(boolean except) { return call631(except); }
    public Object call633(boolean except) { return call632(except); }
    public Object call634(boolean except) { return call633(except); }
    public Object call635(boolean except) { return call634(except); }
    public Object call636(boolean except) { return call635(except); }
    public Object call637(boolean except) { return call636(except); }
    public Object call638(boolean except) { return call637(except); }
    public Object call639(boolean except) { return call638(except); }
    public Object call640(boolean except) { return call639(except); }
    public Object call641(boolean except) { return call640(except); }
    public Object call642(boolean except) { return call641(except); }
    public Object call643(boolean except) { return call642(except); }
    public Object call644(boolean except) { return call643(except); }
    public Object call645(boolean except) { return call644(except); }
    public Object call646(boolean except) { return call645(except); }
    public Object call647(boolean except) { return call646(except); }
    public Object call648(boolean except) { return call647(except); }
    public Object call649(boolean except) { return call648(except); }
    public Object call650(boolean except) { return call649(except); }
    public Object call651(boolean except) { return call650(except); }
    public Object call652(boolean except) { return call651(except); }
    public Object call653(boolean except) { return call652(except); }
    public Object call654(boolean except) { return call653(except); }
    public Object call655(boolean except) { return call654(except); }
    public Object call656(boolean except) { return call655(except); }
    public Object call657(boolean except) { return call656(except); }
    public Object call658(boolean except) { return call657(except); }
    public Object call659(boolean except) { return call658(except); }
    public Object call660(boolean except) { return call659(except); }
    public Object call661(boolean except) { return call660(except); }
    public Object call662(boolean except) { return call661(except); }
    public Object call663(boolean except) { return call662(except); }
    public Object call664(boolean except) { return call663(except); }
    public Object call665(boolean except) { return call664(except); }
    public Object call666(boolean except) { return call665(except); }
    public Object call667(boolean except) { return call666(except); }
    public Object call668(boolean except) { return call667(except); }
    public Object call669(boolean except) { return call668(except); }
    public Object call670(boolean except) { return call669(except); }
    public Object call671(boolean except) { return call670(except); }
    public Object call672(boolean except) { return call671(except); }
    public Object call673(boolean except) { return call672(except); }
    public Object call674(boolean except) { return call673(except); }
    public Object call675(boolean except) { return call674(except); }
    public Object call676(boolean except) { return call675(except); }
    public Object call677(boolean except) { return call676(except); }
    public Object call678(boolean except) { return call677(except); }
    public Object call679(boolean except) { return call678(except); }
    public Object call680(boolean except) { return call679(except); }
    public Object call681(boolean except) { return call680(except); }
    public Object call682(boolean except) { return call681(except); }
    public Object call683(boolean except) { return call682(except); }
    public Object call684(boolean except) { return call683(except); }
    public Object call685(boolean except) { return call684(except); }
    public Object call686(boolean except) { return call685(except); }
    public Object call687(boolean except) { return call686(except); }
    public Object call688(boolean except) { return call687(except); }
    public Object call689(boolean except) { return call688(except); }
    public Object call690(boolean except) { return call689(except); }
    public Object call691(boolean except) { return call690(except); }
    public Object call692(boolean except) { return call691(except); }
    public Object call693(boolean except) { return call692(except); }
    public Object call694(boolean except) { return call693(except); }
    public Object call695(boolean except) { return call694(except); }
    public Object call696(boolean except) { return call695(except); }
    public Object call697(boolean except) { return call696(except); }
    public Object call698(boolean except) { return call697(except); }
    public Object call699(boolean except) { return call698(except); }
    public Object call700(boolean except) { return call699(except); }
    public Object call701(boolean except) { return call700(except); }
    public Object call702(boolean except) { return call701(except); }
    public Object call703(boolean except) { return call702(except); }
    public Object call704(boolean except) { return call703(except); }
    public Object call705(boolean except) { return call704(except); }
    public Object call706(boolean except) { return call705(except); }
    public Object call707(boolean except) { return call706(except); }
    public Object call708(boolean except) { return call707(except); }
    public Object call709(boolean except) { return call708(except); }
    public Object call710(boolean except) { return call709(except); }
    public Object call711(boolean except) { return call710(except); }
    public Object call712(boolean except) { return call711(except); }
    public Object call713(boolean except) { return call712(except); }
    public Object call714(boolean except) { return call713(except); }
    public Object call715(boolean except) { return call714(except); }
    public Object call716(boolean except) { return call715(except); }
    public Object call717(boolean except) { return call716(except); }
    public Object call718(boolean except) { return call717(except); }
    public Object call719(boolean except) { return call718(except); }
    public Object call720(boolean except) { return call719(except); }
    public Object call721(boolean except) { return call720(except); }
    public Object call722(boolean except) { return call721(except); }
    public Object call723(boolean except) { return call722(except); }
    public Object call724(boolean except) { return call723(except); }
    public Object call725(boolean except) { return call724(except); }
    public Object call726(boolean except) { return call725(except); }
    public Object call727(boolean except) { return call726(except); }
    public Object call728(boolean except) { return call727(except); }
    public Object call729(boolean except) { return call728(except); }
    public Object call730(boolean except) { return call729(except); }
    public Object call731(boolean except) { return call730(except); }
    public Object call732(boolean except) { return call731(except); }
    public Object call733(boolean except) { return call732(except); }
    public Object call734(boolean except) { return call733(except); }
    public Object call735(boolean except) { return call734(except); }
    public Object call736(boolean except) { return call735(except); }
    public Object call737(boolean except) { return call736(except); }
    public Object call738(boolean except) { return call737(except); }
    public Object call739(boolean except) { return call738(except); }
    public Object call740(boolean except) { return call739(except); }
    public Object call741(boolean except) { return call740(except); }
    public Object call742(boolean except) { return call741(except); }
    public Object call743(boolean except) { return call742(except); }
    public Object call744(boolean except) { return call743(except); }
    public Object call745(boolean except) { return call744(except); }
    public Object call746(boolean except) { return call745(except); }
    public Object call747(boolean except) { return call746(except); }
    public Object call748(boolean except) { return call747(except); }
    public Object call749(boolean except) { return call748(except); }
    public Object call750(boolean except) { return call749(except); }
    public Object call751(boolean except) { return call750(except); }
    public Object call752(boolean except) { return call751(except); }
    public Object call753(boolean except) { return call752(except); }
    public Object call754(boolean except) { return call753(except); }
    public Object call755(boolean except) { return call754(except); }
    public Object call756(boolean except) { return call755(except); }
    public Object call757(boolean except) { return call756(except); }
    public Object call758(boolean except) { return call757(except); }
    public Object call759(boolean except) { return call758(except); }
    public Object call760(boolean except) { return call759(except); }
    public Object call761(boolean except) { return call760(except); }
    public Object call762(boolean except) { return call761(except); }
    public Object call763(boolean except) { return call762(except); }
    public Object call764(boolean except) { return call763(except); }
    public Object call765(boolean except) { return call764(except); }
    public Object call766(boolean except) { return call765(except); }
    public Object call767(boolean except) { return call766(except); }
    public Object call768(boolean except) { return call767(except); }
    public Object call769(boolean except) { return call768(except); }
    public Object call770(boolean except) { return call769(except); }
    public Object call771(boolean except) { return call770(except); }
    public Object call772(boolean except) { return call771(except); }
    public Object call773(boolean except) { return call772(except); }
    public Object call774(boolean except) { return call773(except); }
    public Object call775(boolean except) { return call774(except); }
    public Object call776(boolean except) { return call775(except); }
    public Object call777(boolean except) { return call776(except); }
    public Object call778(boolean except) { return call777(except); }
    public Object call779(boolean except) { return call778(except); }
    public Object call780(boolean except) { return call779(except); }
    public Object call781(boolean except) { return call780(except); }
    public Object call782(boolean except) { return call781(except); }
    public Object call783(boolean except) { return call782(except); }
    public Object call784(boolean except) { return call783(except); }
    public Object call785(boolean except) { return call784(except); }
    public Object call786(boolean except) { return call785(except); }
    public Object call787(boolean except) { return call786(except); }
    public Object call788(boolean except) { return call787(except); }
    public Object call789(boolean except) { return call788(except); }
    public Object call790(boolean except) { return call789(except); }
    public Object call791(boolean except) { return call790(except); }
    public Object call792(boolean except) { return call791(except); }
    public Object call793(boolean except) { return call792(except); }
    public Object call794(boolean except) { return call793(except); }
    public Object call795(boolean except) { return call794(except); }
    public Object call796(boolean except) { return call795(except); }
    public Object call797(boolean except) { return call796(except); }
    public Object call798(boolean except) { return call797(except); }
    public Object call799(boolean except) { return call798(except); }
    public Object call800(boolean except) { return call799(except); }
    public Object call801(boolean except) { return call800(except); }
    public Object call802(boolean except) { return call801(except); }
    public Object call803(boolean except) { return call802(except); }
    public Object call804(boolean except) { return call803(except); }
    public Object call805(boolean except) { return call804(except); }
    public Object call806(boolean except) { return call805(except); }
    public Object call807(boolean except) { return call806(except); }
    public Object call808(boolean except) { return call807(except); }
    public Object call809(boolean except) { return call808(except); }
    public Object call810(boolean except) { return call809(except); }
    public Object call811(boolean except) { return call810(except); }
    public Object call812(boolean except) { return call811(except); }
    public Object call813(boolean except) { return call812(except); }
    public Object call814(boolean except) { return call813(except); }
    public Object call815(boolean except) { return call814(except); }
    public Object call816(boolean except) { return call815(except); }
    public Object call817(boolean except) { return call816(except); }
    public Object call818(boolean except) { return call817(except); }
    public Object call819(boolean except) { return call818(except); }
    public Object call820(boolean except) { return call819(except); }
    public Object call821(boolean except) { return call820(except); }
    public Object call822(boolean except) { return call821(except); }
    public Object call823(boolean except) { return call822(except); }
    public Object call824(boolean except) { return call823(except); }
    public Object call825(boolean except) { return call824(except); }
    public Object call826(boolean except) { return call825(except); }
    public Object call827(boolean except) { return call826(except); }
    public Object call828(boolean except) { return call827(except); }
    public Object call829(boolean except) { return call828(except); }
    public Object call830(boolean except) { return call829(except); }
    public Object call831(boolean except) { return call830(except); }
    public Object call832(boolean except) { return call831(except); }
    public Object call833(boolean except) { return call832(except); }
    public Object call834(boolean except) { return call833(except); }
    public Object call835(boolean except) { return call834(except); }
    public Object call836(boolean except) { return call835(except); }
    public Object call837(boolean except) { return call836(except); }
    public Object call838(boolean except) { return call837(except); }
    public Object call839(boolean except) { return call838(except); }
    public Object call840(boolean except) { return call839(except); }
    public Object call841(boolean except) { return call840(except); }
    public Object call842(boolean except) { return call841(except); }
    public Object call843(boolean except) { return call842(except); }
    public Object call844(boolean except) { return call843(except); }
    public Object call845(boolean except) { return call844(except); }
    public Object call846(boolean except) { return call845(except); }
    public Object call847(boolean except) { return call846(except); }
    public Object call848(boolean except) { return call847(except); }
    public Object call849(boolean except) { return call848(except); }
    public Object call850(boolean except) { return call849(except); }
    public Object call851(boolean except) { return call850(except); }
    public Object call852(boolean except) { return call851(except); }
    public Object call853(boolean except) { return call852(except); }
    public Object call854(boolean except) { return call853(except); }
    public Object call855(boolean except) { return call854(except); }
    public Object call856(boolean except) { return call855(except); }
    public Object call857(boolean except) { return call856(except); }
    public Object call858(boolean except) { return call857(except); }
    public Object call859(boolean except) { return call858(except); }
    public Object call860(boolean except) { return call859(except); }
    public Object call861(boolean except) { return call860(except); }
    public Object call862(boolean except) { return call861(except); }
    public Object call863(boolean except) { return call862(except); }
    public Object call864(boolean except) { return call863(except); }
    public Object call865(boolean except) { return call864(except); }
    public Object call866(boolean except) { return call865(except); }
    public Object call867(boolean except) { return call866(except); }
    public Object call868(boolean except) { return call867(except); }
    public Object call869(boolean except) { return call868(except); }
    public Object call870(boolean except) { return call869(except); }
    public Object call871(boolean except) { return call870(except); }
    public Object call872(boolean except) { return call871(except); }
    public Object call873(boolean except) { return call872(except); }
    public Object call874(boolean except) { return call873(except); }
    public Object call875(boolean except) { return call874(except); }
    public Object call876(boolean except) { return call875(except); }
    public Object call877(boolean except) { return call876(except); }
    public Object call878(boolean except) { return call877(except); }
    public Object call879(boolean except) { return call878(except); }
    public Object call880(boolean except) { return call879(except); }
    public Object call881(boolean except) { return call880(except); }
    public Object call882(boolean except) { return call881(except); }
    public Object call883(boolean except) { return call882(except); }
    public Object call884(boolean except) { return call883(except); }
    public Object call885(boolean except) { return call884(except); }
    public Object call886(boolean except) { return call885(except); }
    public Object call887(boolean except) { return call886(except); }
    public Object call888(boolean except) { return call887(except); }
    public Object call889(boolean except) { return call888(except); }
    public Object call890(boolean except) { return call889(except); }
    public Object call891(boolean except) { return call890(except); }
    public Object call892(boolean except) { return call891(except); }
    public Object call893(boolean except) { return call892(except); }
    public Object call894(boolean except) { return call893(except); }
    public Object call895(boolean except) { return call894(except); }
    public Object call896(boolean except) { return call895(except); }
    public Object call897(boolean except) { return call896(except); }
    public Object call898(boolean except) { return call897(except); }
    public Object call899(boolean except) { return call898(except); }
    public Object call900(boolean except) { return call899(except); }
    public Object call901(boolean except) { return call900(except); }
    public Object call902(boolean except) { return call901(except); }
    public Object call903(boolean except) { return call902(except); }
    public Object call904(boolean except) { return call903(except); }
    public Object call905(boolean except) { return call904(except); }
    public Object call906(boolean except) { return call905(except); }
    public Object call907(boolean except) { return call906(except); }
    public Object call908(boolean except) { return call907(except); }
    public Object call909(boolean except) { return call908(except); }
    public Object call910(boolean except) { return call909(except); }
    public Object call911(boolean except) { return call910(except); }
    public Object call912(boolean except) { return call911(except); }
    public Object call913(boolean except) { return call912(except); }
    public Object call914(boolean except) { return call913(except); }
    public Object call915(boolean except) { return call914(except); }
    public Object call916(boolean except) { return call915(except); }
    public Object call917(boolean except) { return call916(except); }
    public Object call918(boolean except) { return call917(except); }
    public Object call919(boolean except) { return call918(except); }
    public Object call920(boolean except) { return call919(except); }
    public Object call921(boolean except) { return call920(except); }
    public Object call922(boolean except) { return call921(except); }
    public Object call923(boolean except) { return call922(except); }
    public Object call924(boolean except) { return call923(except); }
    public Object call925(boolean except) { return call924(except); }
    public Object call926(boolean except) { return call925(except); }
    public Object call927(boolean except) { return call926(except); }
    public Object call928(boolean except) { return call927(except); }
    public Object call929(boolean except) { return call928(except); }
    public Object call930(boolean except) { return call929(except); }
    public Object call931(boolean except) { return call930(except); }
    public Object call932(boolean except) { return call931(except); }
    public Object call933(boolean except) { return call932(except); }
    public Object call934(boolean except) { return call933(except); }
    public Object call935(boolean except) { return call934(except); }
    public Object call936(boolean except) { return call935(except); }
    public Object call937(boolean except) { return call936(except); }
    public Object call938(boolean except) { return call937(except); }
    public Object call939(boolean except) { return call938(except); }
    public Object call940(boolean except) { return call939(except); }
    public Object call941(boolean except) { return call940(except); }
    public Object call942(boolean except) { return call941(except); }
    public Object call943(boolean except) { return call942(except); }
    public Object call944(boolean except) { return call943(except); }
    public Object call945(boolean except) { return call944(except); }
    public Object call946(boolean except) { return call945(except); }
    public Object call947(boolean except) { return call946(except); }
    public Object call948(boolean except) { return call947(except); }
    public Object call949(boolean except) { return call948(except); }
    public Object call950(boolean except) { return call949(except); }
    public Object call951(boolean except) { return call950(except); }
    public Object call952(boolean except) { return call951(except); }
    public Object call953(boolean except) { return call952(except); }
    public Object call954(boolean except) { return call953(except); }
    public Object call955(boolean except) { return call954(except); }
    public Object call956(boolean except) { return call955(except); }
    public Object call957(boolean except) { return call956(except); }
    public Object call958(boolean except) { return call957(except); }
    public Object call959(boolean except) { return call958(except); }
    public Object call960(boolean except) { return call959(except); }
    public Object call961(boolean except) { return call960(except); }
    public Object call962(boolean except) { return call961(except); }
    public Object call963(boolean except) { return call962(except); }
    public Object call964(boolean except) { return call963(except); }
    public Object call965(boolean except) { return call964(except); }
    public Object call966(boolean except) { return call965(except); }
    public Object call967(boolean except) { return call966(except); }
    public Object call968(boolean except) { return call967(except); }
    public Object call969(boolean except) { return call968(except); }
    public Object call970(boolean except) { return call969(except); }
    public Object call971(boolean except) { return call970(except); }
    public Object call972(boolean except) { return call971(except); }
    public Object call973(boolean except) { return call972(except); }
    public Object call974(boolean except) { return call973(except); }
    public Object call975(boolean except) { return call974(except); }
    public Object call976(boolean except) { return call975(except); }
    public Object call977(boolean except) { return call976(except); }
    public Object call978(boolean except) { return call977(except); }
    public Object call979(boolean except) { return call978(except); }
    public Object call980(boolean except) { return call979(except); }
    public Object call981(boolean except) { return call980(except); }
    public Object call982(boolean except) { return call981(except); }
    public Object call983(boolean except) { return call982(except); }
    public Object call984(boolean except) { return call983(except); }
    public Object call985(boolean except) { return call984(except); }
    public Object call986(boolean except) { return call985(except); }
    public Object call987(boolean except) { return call986(except); }
    public Object call988(boolean except) { return call987(except); }
    public Object call989(boolean except) { return call988(except); }
    public Object call990(boolean except) { return call989(except); }
    public Object call991(boolean except) { return call990(except); }
    public Object call992(boolean except) { return call991(except); }
    public Object call993(boolean except) { return call992(except); }
    public Object call994(boolean except) { return call993(except); }
    public Object call995(boolean except) { return call994(except); }
    public Object call996(boolean except) { return call995(except); }
    public Object call997(boolean except) { return call996(except); }
    public Object call998(boolean except) { return call997(except); }
    public Object call999(boolean except) { return call998(except); }
    public Object call1000(boolean except) { return call999(except); }
    public Object call1001(boolean except) { return call1000(except); }
    public Object call1002(boolean except) { return call1001(except); }
    public Object call1003(boolean except) { return call1002(except); }
    public Object call1004(boolean except) { return call1003(except); }
    public Object call1005(boolean except) { return call1004(except); }
    public Object call1006(boolean except) { return call1005(except); }
    public Object call1007(boolean except) { return call1006(except); }
    public Object call1008(boolean except) { return call1007(except); }
    public Object call1009(boolean except) { return call1008(except); }
    public Object call1010(boolean except) { return call1009(except); }
    public Object call1011(boolean except) { return call1010(except); }
    public Object call1012(boolean except) { return call1011(except); }
    public Object call1013(boolean except) { return call1012(except); }
    public Object call1014(boolean except) { return call1013(except); }
    public Object call1015(boolean except) { return call1014(except); }
    public Object call1016(boolean except) { return call1015(except); }
    public Object call1017(boolean except) { return call1016(except); }
    public Object call1018(boolean except) { return call1017(except); }
    public Object call1019(boolean except) { return call1018(except); }
    public Object call1020(boolean except) { return call1019(except); }
    public Object call1021(boolean except) { return call1020(except); }
    public Object call1022(boolean except) { return call1021(except); }
    public Object call1023(boolean except) { return call1022(except); }
    public Object call1024(boolean except) { return call1023(except); }
    public Object call1025(boolean except) { return call1024(except); }

    public Object finalCall(boolean except) {
        if (except) {
            return new LilException(source);
        } else {
            return source;
        }
    }

}
