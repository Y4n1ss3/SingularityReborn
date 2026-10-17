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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideoStableKt {
    private static ImageVector _videoStable;

    public static final ImageVector getVideoStable(Icons.TwoTone twoTone) {
        ImageVector imageVector = _videoStable;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VideoStable", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(7.063f, 13.319f, 1.32f, -4.926f), 8.558f, 2.294f, -1.32f, 4.926f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        fc.A(d, 4.0f, 18.0f, 6.0f, 2.95f);
        d.lineToRelative(-2.33f, 8.73f);
        kf0.h(d, 16.82f, 18.0f, 4.0f);
        d.moveTo(15.62f, 15.61f);
        d.lineToRelative(-8.55f, -2.29f);
        d.lineToRelative(1.31f, -4.92f);
        gy.B(d, 8.56f, 2.29f, 15.62f, 15.61f);
        d.moveTo(20.0f, 18.0f);
        d.horizontalLineToRelative(-2.95f);
        d.lineToRelative(2.34f, -8.73f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(d, 7.18f, 6.0f, 20.0f, 18.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoStable = build;
        build.getClass();
        return build;
    }
}
