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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiPeopleKt {
    private static ImageVector _emojiPeople;

    public static final ImageVector getEmojiPeople(Icons.TwoTone twoTone) {
        ImageVector imageVector = _emojiPeople;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EmojiPeople", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b2.curveTo(8.24f, 6.99f, 6.0f, 4.75f, 6.0f, 2.0f);
        b2.horizontalLineTo(4.0f);
        b2.curveToRelative(0.0f, 3.16f, 2.11f, 5.84f, 5.0f, 6.71f);
        uf.p(b2, 22.0f, 2.0f, -6.0f, 2.0f);
        bv.x(b2, 6.0f, 2.0f, 10.05f);
        b2.lineTo(18.95f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b2, 1.41f, -1.41f, 15.89f, 8.11f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiPeople = build;
        build.getClass();
        return build;
    }
}
