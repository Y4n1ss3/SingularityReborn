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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiEmotionsKt {
    private static ImageVector _emojiEmotions;

    public static final ImageVector getEmojiEmotions(Icons.Rounded rounded) {
        ImageVector imageVector = _emojiEmotions;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmojiEmotions", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.99f, 2.0f);
        b.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        b.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 11.99f, 2.0f);
        b.close();
        b.moveTo(8.5f, 8.0f);
        b.curveTo(9.33f, 8.0f, 10.0f, 8.67f, 10.0f, 9.5f);
        b.reflectiveCurveTo(9.33f, 11.0f, 8.5f, 11.0f);
        b.reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f);
        b.reflectiveCurveTo(7.67f, 8.0f, 8.5f, 8.0f);
        b.close();
        b.moveTo(16.71f, 14.72f);
        b.curveTo(15.8f, 16.67f, 14.04f, 18.0f, 12.0f, 18.0f);
        b.reflectiveCurveToRelative(-3.8f, -1.33f, -4.71f, -3.28f);
        b.curveTo(7.13f, 14.39f, 7.37f, 14.0f, 7.74f, 14.0f);
        b.horizontalLineToRelative(8.52f);
        b.curveTo(16.63f, 14.0f, 16.87f, 14.39f, 16.71f, 14.72f);
        b.close();
        b.moveTo(15.5f, 11.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(14.67f, 8.0f, 15.5f, 8.0f);
        b.reflectiveCurveTo(17.0f, 8.67f, 17.0f, 9.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 16.33f, 11.0f, 15.5f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiEmotions = build;
        build.getClass();
        return build;
    }
}
