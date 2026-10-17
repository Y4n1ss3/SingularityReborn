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
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiPeopleKt {
    private static ImageVector _emojiPeople;

    public static final ImageVector getEmojiPeople(Icons.Rounded rounded) {
        ImageVector imageVector = _emojiPeople;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmojiPeople", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 4.0f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(15.89f, 8.11f);
        b2.curveTo(15.5f, 7.72f, 14.83f, 7.0f, 13.53f, 7.0f);
        b2.curveToRelative(-0.21f, 0.0f, -1.42f, 0.0f, -2.54f, 0.0f);
        b2.curveTo(8.53f, 6.99f, 6.48f, 5.2f, 6.07f, 2.85f);
        b2.curveTo(5.99f, 2.36f, 5.58f, 2.0f, 5.09f, 2.0f);
        b2.horizontalLineToRelative(0.0f);
        b2.curveToRelative(-0.61f, 0.0f, -1.09f, 0.54f, -1.0f, 1.14f);
        b2.curveTo(4.53f, 5.8f, 6.47f, 7.95f, 9.0f, 8.71f);
        b2.verticalLineTo(21.0f);
        b2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b2.horizontalLineToRelative(0.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(b2, -5.0f, 2.0f, 5.0f);
        b2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b2.horizontalLineToRelative(0.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b2.verticalLineTo(10.05f);
        b2.lineToRelative(3.24f, 3.24f);
        b2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b2.verticalLineToRelative(0.0f);
        b2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 15.89f, 8.11f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiPeople = build;
        build.getClass();
        return build;
    }
}
