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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkAsUnreadKt {
    private static ImageVector _markAsUnread;

    public static final ImageVector getMarkAsUnread(Icons.Rounded rounded) {
        ImageVector imageVector = _markAsUnread;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MarkAsUnread", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(16.23f, 7.0f, 2.6f);
        a.curveToRelative(-0.06f, -0.47f, -0.36f, -0.94f, -0.79f, -1.17f);
        a.lineTo(11.4f, 2.45f);
        a.curveToRelative(-0.56f, -0.29f, -1.23f, -0.29f, -1.8f, -0.01f);
        a.lineTo(2.8f, 5.83f);
        a.curveTo(2.32f, 6.09f, 2.0f, 6.64f, 2.0f, 7.17f);
        a.verticalLineTo(15.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.verticalLineTo(7.4f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(a, 10.5f, 4.0f, 16.23f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 8.0f, 7.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        d.verticalLineToRelative(9.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(13.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-9.0f);
        d.curveTo(22.0f, 8.9f, 21.1f, 8.0f, 20.0f, 8.0f);
        d.close();
        d.moveTo(20.0f, 11.46f);
        d.curveToRelative(0.0f, 0.33f, -0.19f, 0.64f, -0.48f, 0.79f);
        d.lineToRelative(-5.61f, 2.88f);
        d.curveToRelative(-0.25f, 0.13f, -0.56f, 0.13f, -0.81f, 0.0f);
        d.lineToRelative(-5.61f, -2.88f);
        d.curveTo(7.19f, 12.1f, 7.0f, 11.79f, 7.0f, 11.46f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.67f, 0.7f, -1.1f, 1.3f, -0.79f);
        d.lineToRelative(5.2f, 2.67f);
        d.lineToRelative(5.2f, -2.67f);
        d.curveTo(19.3f, 10.36f, 20.0f, 10.79f, 20.0f, 11.46f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(d, 20.0f, 11.46f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markAsUnread = build;
        build.getClass();
        return build;
    }
}
