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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiFlagsKt {
    private static ImageVector _emojiFlags;

    public static final ImageVector getEmojiFlags(Icons.TwoTone twoTone) {
        ImageVector imageVector = _emojiFlags;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EmojiFlags", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 9.0f, -5.0f, 0.0f);
        e.lineToRelative(0.0f, 6.0f);
        e.lineToRelative(6.0f, 0.0f);
        e.lineToRelative(1.0f, 2.0f);
        e.lineToRelative(4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, -6.0f, -5.0f, 0.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder u = gy.u(14.0f, 9.0f, -1.0f, -2.0f, 7.0f);
        u.verticalLineTo(5.72f);
        u.curveTo(7.6f, 5.38f, 8.0f, 4.74f, 8.0f, 4.0f);
        u.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        u.reflectiveCurveTo(4.0f, 2.9f, 4.0f, 4.0f);
        u.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        uf.p(u, 21.0f, 2.0f, -4.0f, 5.0f);
        fc.r(u, 1.0f, 2.0f, 7.0f, 9.0f);
        kp0.r(u, 14.0f, 18.0f, 17.0f, -4.0f);
        kp0.v(u, -1.0f, -2.0f, 7.0f, 9.0f);
        kf0.B(u, 5.0f, 1.0f, 2.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(u, 17.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiFlags = build;
        build.getClass();
        return build;
    }
}
