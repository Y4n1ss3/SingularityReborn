package androidx.compose.material.icons.rounded;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RssFeedKt {
    private static ImageVector _rssFeed;

    public static final ImageVector getRssFeed(Icons.Rounded rounded) {
        ImageVector imageVector = _rssFeed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RssFeed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(6.18f, 17.82f, -2.18f, 0.0f);
        b.arcToRelative(2.18f, 2.18f, 0.0f, true, true, 4.36f, 0.0f);
        b.arcToRelative(2.18f, 2.18f, 0.0f, true, true, -4.36f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(5.59f, 10.23f);
        b2.curveToRelative(-0.84f, -0.14f, -1.59f, 0.55f, -1.59f, 1.4f);
        b2.curveToRelative(0.0f, 0.71f, 0.53f, 1.28f, 1.23f, 1.4f);
        b2.curveToRelative(2.92f, 0.51f, 5.22f, 2.82f, 5.74f, 5.74f);
        b2.curveToRelative(0.12f, 0.7f, 0.69f, 1.23f, 1.4f, 1.23f);
        b2.curveToRelative(0.85f, 0.0f, 1.54f, -0.75f, 1.41f, -1.59f);
        b2.curveToRelative(-0.68f, -4.2f, -3.99f, -7.51f, -8.19f, -8.18f);
        b2.close();
        b2.moveTo(5.56f, 4.52f);
        b2.curveTo(4.73f, 4.43f, 4.0f, 5.1f, 4.0f, 5.93f);
        b2.curveToRelative(0.0f, 0.73f, 0.55f, 1.33f, 1.27f, 1.4f);
        b2.curveToRelative(6.01f, 0.6f, 10.79f, 5.38f, 11.39f, 11.39f);
        b2.curveToRelative(0.07f, 0.73f, 0.67f, 1.28f, 1.4f, 1.28f);
        b2.curveToRelative(0.84f, 0.0f, 1.5f, -0.73f, 1.42f, -1.56f);
        b2.curveToRelative(-0.73f, -7.34f, -6.57f, -13.19f, -13.92f, -13.92f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rssFeed = build;
        build.getClass();
        return build;
    }
}
