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
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LunchDiningKt {
    private static ImageVector _lunchDining;

    public static final ImageVector getLunchDining(Icons.Sharp sharp) {
        ImageVector imageVector = _lunchDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LunchDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(2.0f, 16.0f, 20.0f, 5.0f, -20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.66f, 11.5f);
        b.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        b.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        b.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        b.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        b.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f);
        b.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        b.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        b.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        b.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        b.curveToRelative(1.19f, 0.0f, 1.4f, 0.98f, 3.32f, 1.0f);
        b.lineToRelative(-0.01f, -1.98f);
        b.curveTo(20.38f, 12.19f, 20.37f, 11.5f, 18.66f, 11.5f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(22.0f, 9.0f);
        b2.curveToRelative(0.02f, -4.0f, -4.28f, -6.0f, -10.0f, -6.0f);
        b2.curveTo(6.29f, 3.0f, 2.0f, 5.0f, 2.0f, 9.0f);
        uo.B(b2, 1.0f, 20.0f, 22.0f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 22.0f, 9.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lunchDining = build;
        build.getClass();
        return build;
    }
}
