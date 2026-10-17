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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermMediaKt {
    private static ImageVector _permMedia;

    public static final ImageVector getPermMedia(Icons.Rounded rounded) {
        ImageVector imageVector = _permMedia;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PermMedia", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(19.0f, 19.0f, 3.0f, 7.0f);
        c.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c.reflectiveCurveTo(1.0f, 6.45f, 1.0f, 7.0f);
        c.verticalLineToRelative(12.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(16.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 19.55f, 19.0f, 19.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(21.0f, 4.0f, -7.0f, -1.41f, -1.41f);
        i.curveTo(12.21f, 2.21f, 11.7f, 2.0f, 11.17f, 2.0f);
        i.horizontalLineTo(7.0f);
        i.curveTo(5.9f, 2.0f, 5.01f, 2.9f, 5.01f, 4.0f);
        i.lineTo(5.0f, 15.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(6.0f);
        i.curveTo(23.0f, 4.9f, 22.1f, 4.0f, 21.0f, 4.0f);
        af0.l(i, 18.0f, 13.0f, -8.0f);
        i.curveToRelative(-0.41f, 0.0f, -0.65f, -0.47f, -0.4f, -0.8f);
        i.lineToRelative(1.38f, -1.83f);
        i.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        i.lineTo(13.0f, 12.0f);
        i.lineToRelative(2.22f, -2.97f);
        i.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        i.lineToRelative(2.38f, 3.17f);
        i.curveTo(18.65f, 12.53f, 18.41f, 13.0f, 18.0f, 13.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permMedia = build;
        build.getClass();
        return build;
    }
}
