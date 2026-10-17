package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FactCheckKt {
    private static ImageVector _factCheck;

    public static final ImageVector getFactCheck(Icons.Sharp sharp) {
        ImageVector imageVector = _factCheck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FactCheck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int m5057getEvenOddRgk1Os = PathFillType.Companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(2.0f, 3.0f, 18.0f, 20.0f, 3.0f);
        kp0.B(w, 2.0f, 10.0f, 17.0f, 5.0f);
        k4.p(w, -2.0f, 5.0f, 17.0f);
        k4.A(w, 10.0f, 13.0f, 5.0f, -2.0f);
        uo.r(w, 5.0f, 13.0f, 10.0f, 9.0f);
        uo.o(w, 5.0f, 7.0f, 5.0f, 9.0f);
        w.moveTo(14.82f, 15.0f);
        w.lineTo(12.0f, 12.16f);
        w.lineToRelative(1.41f, -1.41f);
        w.lineToRelative(1.41f, 1.42f);
        w.lineTo(17.99f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(w, 1.42f, 1.42f, 14.82f, 15.0f), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _factCheck = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFactCheck$annotations(Icons.Sharp sharp) {
    }
}
