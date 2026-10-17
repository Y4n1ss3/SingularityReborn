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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StarKt {
    private static ImageVector _star;

    public static final ImageVector getStar(Icons.TwoTone twoTone) {
        ImageVector imageVector = _star;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Star", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 15.4f, -3.76f, 2.27f);
        e.lineToRelative(1.0f, -4.28f);
        e.lineToRelative(-3.32f, -2.88f);
        e.lineToRelative(4.38f, -0.38f);
        e.lineToRelative(1.7f, -4.03f);
        e.lineToRelative(1.71f, 4.04f);
        e.lineToRelative(4.38f, 0.38f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -3.32f, 2.88f, 1.0f, 4.28f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(22.0f, 9.24f, -7.19f, -0.62f);
        e2.lineTo(12.0f, 2.0f);
        e2.lineTo(9.19f, 8.63f);
        e2.lineTo(2.0f, 9.24f);
        e2.lineToRelative(5.46f, 4.73f);
        e2.lineTo(5.82f, 21.0f);
        e2.lineTo(12.0f, 17.27f);
        e2.lineTo(18.18f, 21.0f);
        gy.B(e2, -1.63f, -7.03f, 22.0f, 9.24f);
        e2.moveTo(12.0f, 15.4f);
        e2.lineToRelative(-3.76f, 2.27f);
        e2.lineToRelative(1.0f, -4.28f);
        e2.lineToRelative(-3.32f, -2.88f);
        e2.lineToRelative(4.38f, -0.38f);
        e2.lineTo(12.0f, 6.1f);
        e2.lineToRelative(1.71f, 4.04f);
        e2.lineToRelative(4.38f, 0.38f);
        e2.lineToRelative(-3.32f, 2.88f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e2, 1.0f, 4.28f, 12.0f, 15.4f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _star = build;
        build.getClass();
        return build;
    }
}
