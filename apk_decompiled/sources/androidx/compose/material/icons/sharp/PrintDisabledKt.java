package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrintDisabledKt {
    private static ImageVector _printDisabled;

    public static final ImageVector getPrintDisabled(Icons.Sharp sharp) {
        ImageVector imageVector = _printDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PrintDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(9.65f, 7.0f, 18.0f, 7.0f);
        i.lineTo(18.0f, 3.01f);
        bv.r(i, 6.0f, 3.01f, 0.35f);
        i.moveTo(10.66f, 8.01f);
        i.lineToRelative(9.0f, 8.99f);
        i.lineTo(22.0f, 17.0f);
        i.verticalLineToRelative(-5.99f);
        i.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        j50.t(i, -8.34f, 19.0f, 10.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        k4.r(i, 1.41f, 1.6f, 0.0f, 3.01f);
        i.lineToRelative(5.0f, 5.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, 1.33f, -3.0f, 2.99f);
        r6.D(i, 6.0f, 4.0f, 4.0f, 12.0f);
        i.lineToRelative(2.95f, 2.96f);
        gy.B(i, 1.41f, -1.41f, 1.41f, 1.6f);
        i.moveTo(8.0f, 19.01f);
        i.lineTo(8.0f, 15.0f);
        i.horizontalLineToRelative(4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 4.0f, 4.0f, -8.0f, 0.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _printDisabled = build;
        build.getClass();
        return build;
    }
}
