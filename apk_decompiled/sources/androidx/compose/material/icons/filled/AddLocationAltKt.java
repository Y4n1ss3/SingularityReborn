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
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddLocationAltKt {
    private static ImageVector _addLocationAlt;

    public static final ImageVector getAddLocationAlt(Icons.Filled filled) {
        ImageVector imageVector = _addLocationAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddLocationAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(20.0f, 1.0f, 3.0f, 3.0f, 2.0f);
        kf0.x(s, -3.0f, 3.0f, -2.0f);
        s.lineTo(18.0f, 6.0f);
        uo.n(s, -3.0f, 15.0f, 4.0f, 3.0f);
        uf.j(s, 18.0f, 1.0f, 2.0f);
        s.moveTo(12.0f, 13.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        s.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        s.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        k4.r(s, 14.0f, 3.25f, 14.0f, 7.0f);
        kf0.x(s, 3.0f, 3.0f, 2.92f);
        s.curveToRelative(0.05f, 0.39f, 0.08f, 0.79f, 0.08f, 1.2f);
        s.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        s.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        s.curveTo(4.0f, 6.22f, 7.8f, 3.0f, 12.0f, 3.0f);
        s.curveToRelative(0.68f, 0.0f, 1.35f, 0.08f, 2.0f, 0.25f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLocationAlt = build;
        build.getClass();
        return build;
    }
}
