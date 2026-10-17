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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiEmotionsKt {
    private static ImageVector _emojiEmotions;

    public static final ImageVector getEmojiEmotions(Icons.Filled filled) {
        ImageVector imageVector = _emojiEmotions;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EmojiEmotions", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.moveTo(12.0f, 18.0f);
        b.curveToRelative(-2.28f, 0.0f, -4.22f, -1.66f, -5.0f, -4.0f);
        b.horizontalLineToRelative(10.0f);
        b.curveTo(16.22f, 16.34f, 14.28f, 18.0f, 12.0f, 18.0f);
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
