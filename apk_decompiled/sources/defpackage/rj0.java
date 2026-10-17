package defpackage;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class rj0 implements DoubleFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferParameters b;

    public /* synthetic */ rj0(TransferParameters transferParameters, int i) {
        this.a = i;
        this.b = transferParameters;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        double generateEotf$lambda$0;
        double generateEotf$lambda$1;
        double generateEotf$lambda$2;
        double generateEotf$lambda$3;
        double generateOetf$lambda$0;
        double generateOetf$lambda$1;
        double generateOetf$lambda$2;
        double generateOetf$lambda$3;
        int i = this.a;
        TransferParameters transferParameters = this.b;
        switch (i) {
            case 0:
                generateEotf$lambda$0 = Rgb.Companion.generateEotf$lambda$0(transferParameters, d);
                return generateEotf$lambda$0;
            case 1:
                generateEotf$lambda$1 = Rgb.Companion.generateEotf$lambda$1(transferParameters, d);
                return generateEotf$lambda$1;
            case 2:
                generateEotf$lambda$2 = Rgb.Companion.generateEotf$lambda$2(transferParameters, d);
                return generateEotf$lambda$2;
            case 3:
                generateEotf$lambda$3 = Rgb.Companion.generateEotf$lambda$3(transferParameters, d);
                return generateEotf$lambda$3;
            case 4:
                generateOetf$lambda$0 = Rgb.Companion.generateOetf$lambda$0(transferParameters, d);
                return generateOetf$lambda$0;
            case 5:
                generateOetf$lambda$1 = Rgb.Companion.generateOetf$lambda$1(transferParameters, d);
                return generateOetf$lambda$1;
            case 6:
                generateOetf$lambda$2 = Rgb.Companion.generateOetf$lambda$2(transferParameters, d);
                return generateOetf$lambda$2;
            default:
                generateOetf$lambda$3 = Rgb.Companion.generateOetf$lambda$3(transferParameters, d);
                return generateOetf$lambda$3;
        }
    }
}
