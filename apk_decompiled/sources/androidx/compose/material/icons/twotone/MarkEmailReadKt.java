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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkEmailReadKt {
    private static ImageVector _markEmailRead;

    public static final ImageVector getMarkEmailRead(Icons.TwoTone twoTone) {
        ImageVector imageVector = _markEmailRead;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MarkEmailRead", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(20.0f, 8.0f, 4.08f);
        h.curveTo(19.67f, 12.03f, 19.34f, 12.0f, 19.0f, 12.0f);
        h.curveToRelative(-3.53f, 0.0f, -6.43f, 2.61f, -6.92f, 6.0f);
        h.horizontalLineTo(4.0f);
        h.verticalLineTo(8.0f);
        h.lineToRelative(8.0f, 5.0f);
        uo.l(h, 20.0f, 8.0f, 20.0f, 6.0f);
        h.horizontalLineTo(4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(h, 8.0f, 5.0f, 20.0f, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(12.08f, 18.0f, 4.0f, 8.0f);
        c.lineToRelative(8.0f, 5.0f);
        c.lineToRelative(8.0f, -5.0f);
        c.verticalLineToRelative(4.08f);
        c.curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2.0f, 0.6f);
        c.verticalLineTo(6.0f);
        c.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c.horizontalLineTo(4.0f);
        c.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        c.lineTo(2.0f, 18.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(8.08f);
        c.curveTo(12.03f, 19.67f, 12.0f, 19.34f, 12.0f, 19.0f);
        c.reflectiveCurveTo(12.03f, 18.33f, 12.08f, 18.0f);
        k4.x(c, 20.0f, 6.0f, -8.0f, 5.0f);
        kf0.h(c, 4.0f, 6.0f, 20.0f);
        c.moveTo(17.34f, 22.0f);
        c.lineToRelative(-3.54f, -3.54f);
        c.lineToRelative(1.41f, -1.41f);
        c.lineToRelative(2.12f, 2.12f);
        c.lineToRelative(4.24f, -4.24f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(c, 23.0f, 16.34f, 17.34f, 22.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markEmailRead = build;
        build.getClass();
        return build;
    }
}
