package androidx.compose.material.icons.outlined;

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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutoFixNormalKt {
    private static ImageVector _autoFixNormal;

    public static final ImageVector getAutoFixNormal(Icons.Outlined outlined) {
        ImageVector imageVector = _autoFixNormal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AutoFixNormal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.0f, 7.0f, 0.94f, -2.06f);
        e.lineToRelative(2.06f, -0.94f);
        e.lineToRelative(-2.06f, -0.94f);
        e.lineToRelative(-0.94f, -2.06f);
        e.lineToRelative(-0.94f, 2.06f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -2.06f, 0.94f, 2.06f, 0.94f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(17.71f, 9.12f, -2.83f, -2.83f);
        e2.curveTo(14.68f, 6.1f, 14.43f, 6.0f, 14.17f, 6.0f);
        e2.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        e2.lineTo(2.29f, 17.46f);
        e2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e2.lineToRelative(2.83f, 2.83f);
        e2.curveTo(5.32f, 21.9f, 5.57f, 22.0f, 5.83f, 22.0f);
        e2.reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f);
        e2.lineToRelative(11.17f, -11.17f);
        e2.curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f);
        k4.x(e2, 14.17f, 8.42f, 1.41f, 1.41f);
        e2.lineTo(14.41f, 11.0f);
        r6.C(e2, 13.0f, 9.59f, 14.17f, 8.42f);
        e2.moveTo(5.83f, 19.59f);
        e2.lineToRelative(-1.41f, -1.41f);
        e2.lineTo(11.59f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e2, 13.0f, 12.41f, 5.83f, 19.59f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixNormal = build;
        build.getClass();
        return build;
    }
}
