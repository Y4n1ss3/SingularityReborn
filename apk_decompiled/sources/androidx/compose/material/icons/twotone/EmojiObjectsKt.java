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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiObjectsKt {
    private static ImageVector _emojiObjects;

    public static final ImageVector getEmojiObjects(Icons.TwoTone twoTone) {
        ImageVector imageVector = _emojiObjects;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EmojiObjects", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(10.0f, 18.0f, 4.0f, 1.0f, -4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(10.0f, 16.0f, 4.0f, 1.0f, -4.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.0f);
        b.curveToRelative(-0.46f, 0.0f, -0.93f, 0.04f, -1.4f, 0.14f);
        b.curveTo(7.84f, 3.67f, 5.64f, 5.9f, 5.12f, 8.66f);
        b.curveToRelative(-0.48f, 2.61f, 0.48f, 5.01f, 2.22f, 6.56f);
        b.curveTo(7.77f, 15.6f, 8.0f, 16.13f, 8.0f, 16.69f);
        b.verticalLineTo(19.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(0.28f);
        b.curveToRelative(0.35f, 0.6f, 0.98f, 1.0f, 1.72f, 1.0f);
        b.reflectiveCurveToRelative(1.38f, -0.4f, 1.72f, -1.0f);
        b.horizontalLineTo(14.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-2.31f);
        b.curveToRelative(0.0f, -0.55f, 0.22f, -1.09f, 0.64f, -1.46f);
        b.curveTo(18.09f, 13.95f, 19.0f, 12.08f, 19.0f, 10.0f);
        b.curveTo(19.0f, 6.13f, 15.87f, 3.0f, 12.0f, 3.0f);
        r6.B(b, 14.0f, 19.0f, -4.0f, -1.0f);
        uo.r(b, 4.0f, 19.0f, 14.0f, 17.0f);
        bv.l(b, -4.0f, -1.0f, 4.0f, 17.0f);
        b.moveTo(15.31f, 13.74f);
        b.curveToRelative(-0.09f, 0.08f, -0.16f, 0.18f, -0.24f, 0.26f);
        b.horizontalLineTo(8.92f);
        b.curveToRelative(-0.08f, -0.09f, -0.15f, -0.19f, -0.24f, -0.27f);
        b.curveToRelative(-1.32f, -1.18f, -1.91f, -2.94f, -1.59f, -4.7f);
        b.curveToRelative(0.36f, -1.94f, 1.96f, -3.55f, 3.89f, -3.93f);
        b.curveTo(11.32f, 5.03f, 11.66f, 5.0f, 12.0f, 5.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        b.curveTo(17.0f, 11.43f, 16.39f, 12.79f, 15.31f, 13.74f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(11.5f, 11.0f, 1.0f, 3.0f, -1.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(9.672f, 9.581f, 0.707f, -0.707f), 2.121f, 2.121f, -0.707f, 0.707f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(12.208f, 11.712f, -0.707f, -0.707f), 2.121f, -2.121f, 0.707f, 0.707f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiObjects = build;
        build.getClass();
        return build;
    }
}
