package androidx.compose.material.icons.outlined;

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
public final class PodcastsKt {
    private static ImageVector _podcasts;

    public static final ImageVector getPodcasts(Icons.Outlined outlined) {
        ImageVector imageVector = _podcasts;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Podcasts", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.0f, 12.0f);
        b.curveToRelative(0.0f, 0.74f, -0.4f, 1.38f, -1.0f, 1.72f);
        kf0.r(b, 22.0f, -2.0f, -8.28f);
        b.curveToRelative(-0.6f, -0.35f, -1.0f, -0.98f, -1.0f, -1.72f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f);
        b.close();
        b.moveTo(12.0f, 6.0f);
        b.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        b.curveToRelative(0.0f, 1.74f, 0.75f, 3.31f, 1.94f, 4.4f);
        b.lineToRelative(1.42f, -1.42f);
        b.curveTo(8.53f, 14.25f, 8.0f, 13.19f, 8.0f, 12.0f);
        b.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 1.19f, -0.53f, 2.25f, -1.36f, 2.98f);
        b.lineToRelative(1.42f, 1.42f);
        b.curveTo(17.25f, 15.31f, 18.0f, 13.74f, 18.0f, 12.0f);
        b.curveTo(18.0f, 8.69f, 15.31f, 6.0f, 12.0f, 6.0f);
        b.close();
        b.moveTo(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 2.85f, 1.2f, 5.41f, 3.11f, 7.24f);
        b.lineToRelative(1.42f, -1.42f);
        b.curveTo(4.98f, 16.36f, 4.0f, 14.29f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.curveToRelative(0.0f, 2.29f, -0.98f, 4.36f, -2.53f, 5.82f);
        b.lineToRelative(1.42f, 1.42f);
        b.curveTo(20.8f, 17.41f, 22.0f, 14.85f, 22.0f, 12.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _podcasts = build;
        build.getClass();
        return build;
    }
}
