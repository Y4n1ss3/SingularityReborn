package androidx.compose.material.icons.twotone;

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
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddLocationAltKt {
    private static ImageVector _addLocationAlt;

    public static final ImageVector getAddLocationAlt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _addLocationAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AddLocationAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(14.0f, 4.8f, 7.0f, 3.0f, 3.0f);
        c.horizontalLineToRelative(1.41f);
        c.curveToRelative(0.06f, 0.39f, 0.09f, 0.79f, 0.09f, 1.2f);
        c.curveToRelative(0.0f, 2.57f, -2.1f, 5.79f, -6.16f, 9.51f);
        c.lineTo(12.0f, 21.01f);
        c.lineToRelative(-0.34f, -0.31f);
        c.curveTo(7.6f, 16.99f, 5.5f, 13.77f, 5.5f, 11.2f);
        c.curveToRelative(0.0f, -3.84f, 2.82f, -6.7f, 6.5f, -6.7f);
        c.curveTo(12.7f, 4.5f, 13.37f, 4.6f, 14.0f, 4.8f);
        c.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(20.0f, 1.0f, 3.0f, 3.0f, 2.0f);
        af0.w(s, -3.0f, 3.0f, -2.0f, 6.0f);
        af0.n(s, -3.0f, 4.0f, 3.0f, 1.0f);
        k4.w(s, 20.0f, 12.0f, 13.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        s.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        s.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        s.reflectiveCurveTo(13.1f, 13.0f, 12.0f, 13.0f);
        bv.v(s, 14.0f, 3.25f, 2.08f);
        s.curveTo(13.38f, 5.11f, 12.7f, 5.0f, 12.0f, 5.0f);
        s.curveToRelative(-3.35f, 0.0f, -6.0f, 2.57f, -6.0f, 6.2f);
        s.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        s.curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f);
        s.curveToRelative(0.0f, -0.41f, -0.03f, -0.81f, -0.1f, -1.2f);
        s.horizontalLineToRelative(2.02f);
        s.curveToRelative(0.05f, 0.39f, 0.08f, 0.79f, 0.08f, 1.2f);
        s.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        s.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        s.curveTo(4.0f, 6.22f, 7.8f, 3.0f, 12.0f, 3.0f);
        s.curveTo(12.68f, 3.0f, 13.35f, 3.08f, 14.0f, 3.25f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLocationAlt = build;
        build.getClass();
        return build;
    }
}
