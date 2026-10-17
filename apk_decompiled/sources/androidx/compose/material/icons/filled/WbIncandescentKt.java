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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbIncandescentKt {
    private static ImageVector _wbIncandescent;

    public static final ImageVector getWbIncandescent(Icons.Filled filled) {
        ImageVector imageVector = _wbIncandescent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WbIncandescent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.55f, 18.54f, 1.41f, 1.41f);
        e.lineToRelative(1.79f, -1.8f);
        fc.C(e, -1.41f, -1.41f, -1.79f, 1.8f);
        e.moveTo(11.0f, 22.45f);
        uo.n(e, 2.0f, 13.0f, 19.5f, -2.0f);
        r6.l(e, 2.95f, 4.0f, 10.5f);
        af0.m(e, 1.0f, 10.5f, 2.0f, 3.0f);
        r6.l(e, -2.0f, 15.0f, 6.31f);
        e.lineTo(15.0f, 1.5f);
        e.lineTo(9.0f, 1.5f);
        e.verticalLineToRelative(4.81f);
        e.curveTo(7.21f, 7.35f, 6.0f, 9.28f, 6.0f, 11.5f);
        e.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        e.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        e.curveToRelative(0.0f, -2.22f, -1.21f, -4.15f, -3.0f, -5.19f);
        uo.C(e, 20.0f, 10.5f, 2.0f, 3.0f);
        kf0.C(e, -2.0f, -3.0f, 17.24f, 18.16f);
        e.lineToRelative(1.79f, 1.8f);
        e.lineToRelative(1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -1.8f, -1.79f, -1.4f, 1.4f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIncandescent = build;
        build.getClass();
        return build;
    }
}
