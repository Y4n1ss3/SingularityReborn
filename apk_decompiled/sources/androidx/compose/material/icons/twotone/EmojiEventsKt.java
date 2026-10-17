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
import defpackage.fc;
import defpackage.j50;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiEventsKt {
    private static ImageVector _emojiEvents;

    public static final ImageVector getEmojiEvents(Icons.TwoTone twoTone) {
        ImageVector imageVector = _emojiEvents;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EmojiEvents", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 14.0f);
        b.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        kf0.r(b, 5.0f, 6.0f, 6.0f);
        b.curveTo(15.0f, 12.65f, 13.65f, 14.0f, 12.0f, 14.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(19.0f, 5.0f, -2.0f, 3.0f, 7.0f);
        v.verticalLineToRelative(2.0f);
        v.horizontalLineTo(5.0f);
        v.curveTo(3.9f, 5.0f, 3.0f, 5.9f, 3.0f, 7.0f);
        v.verticalLineToRelative(1.0f);
        v.curveToRelative(0.0f, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f);
        v.curveToRelative(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f);
        bv.A(v, 19.0f, 7.0f, 2.0f, 10.0f);
        kf0.z(v, -2.0f, -4.0f, -3.1f);
        v.curveToRelative(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f);
        v.curveTo(19.08f, 12.63f, 21.0f, 10.55f, 21.0f, 8.0f);
        v.verticalLineTo(7.0f);
        v.curveTo(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f);
        fc.A(v, 5.0f, 8.0f, 7.0f, 2.0f);
        v.verticalLineToRelative(3.82f);
        v.curveTo(5.84f, 10.4f, 5.0f, 9.3f, 5.0f, 8.0f);
        v.close();
        v.moveTo(12.0f, 14.0f);
        v.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        kf0.r(v, 5.0f, 6.0f, 6.0f);
        v.curveTo(15.0f, 12.65f, 13.65f, 14.0f, 12.0f, 14.0f);
        v.close();
        v.moveTo(19.0f, 8.0f);
        v.curveToRelative(0.0f, 1.3f, -0.84f, 2.4f, -2.0f, 2.82f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(v, 7.0f, 2.0f, 8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiEvents = build;
        build.getClass();
        return build;
    }
}
