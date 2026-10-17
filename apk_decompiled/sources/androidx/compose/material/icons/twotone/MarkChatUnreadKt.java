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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkChatUnreadKt {
    private static ImageVector _markChatUnread;

    public static final ImageVector getMarkChatUnread(Icons.TwoTone twoTone) {
        ImageVector imageVector = _markChatUnread;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MarkChatUnread", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(4.0f, 16.0f, 16.0f, 7.9f);
        e.curveTo(19.68f, 7.96f, 19.34f, 8.0f, 19.0f, 8.0f);
        e.curveToRelative(-2.42f, 0.0f, -4.44f, -1.72f, -4.9f, -4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(e, 4.0f, 16.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 7.9f);
        b.curveToRelative(0.74f, -0.15f, 1.42f, -0.48f, 2.0f, -0.92f);
        b.verticalLineTo(16.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineTo(6.0f);
        b.lineToRelative(-4.0f, 4.0f);
        b.verticalLineTo(4.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.horizontalLineToRelative(10.1f);
        b.curveTo(14.04f, 2.32f, 14.0f, 2.66f, 14.0f, 3.0f);
        b.reflectiveCurveToRelative(0.04f, 0.68f, 0.1f, 1.0f);
        bv.h(b, 4.0f, 12.0f, 16.0f, 7.9f);
        b.moveTo(16.0f, 3.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 16.0f, 1.34f, 16.0f, 3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markChatUnread = build;
        build.getClass();
        return build;
    }
}
