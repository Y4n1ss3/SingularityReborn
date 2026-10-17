package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrintDisabledKt {
    private static ImageVector _printDisabled;

    public static final ImageVector getPrintDisabled(Icons.Filled filled) {
        ImageVector imageVector = _printDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PrintDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(19.1f, 17.0f, 22.0f, 17.0f, -6.0f);
        s.curveToRelative(0.0f, -1.7f, -1.3f, -3.0f, -3.0f, -3.0f);
        uo.w(s, -9.0f, 9.1f, 9.0f);
        s.moveTo(19.0f, 10.0f);
        s.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        s.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        s.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        s.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        k4.r(s, 18.0f, 7.0f, 18.0f, 3.0f);
        s.lineTo(6.0f, 3.0f);
        kf0.t(s, 1.1f, 9.0f, 7.0f);
        s.moveTo(1.2f, 1.8f);
        s.lineTo(0.0f, 3.0f);
        s.lineToRelative(4.9f, 5.0f);
        s.curveTo(3.3f, 8.1f, 2.0f, 9.4f, 2.0f, 11.0f);
        r6.D(s, 6.0f, 4.0f, 4.0f, 11.9f);
        s.lineToRelative(3.0f, 3.0f);
        fc.C(s, 1.3f, -1.3f, -21.0f, -20.9f);
        bv.y(s, 8.0f, 19.0f, -5.0f, 2.9f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(s, 5.0f, 5.0f, 8.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _printDisabled = build;
        build.getClass();
        return build;
    }
}
