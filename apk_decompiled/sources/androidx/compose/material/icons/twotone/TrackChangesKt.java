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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TrackChangesKt {
    private static ImageVector _trackChanges;

    public static final ImageVector getTrackChanges(Icons.TwoTone twoTone) {
        ImageVector imageVector = _trackChanges;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TrackChanges", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.07f, 4.93f, -1.41f, 1.41f);
        e.curveTo(19.1f, 7.79f, 20.0f, 9.79f, 20.0f, 12.0f);
        e.curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
        e.reflectiveCurveToRelative(-8.0f, -3.58f, -8.0f, -8.0f);
        e.curveToRelative(0.0f, -4.08f, 3.05f, -7.44f, 7.0f, -7.93f);
        e.verticalLineToRelative(2.02f);
        e.curveTo(8.16f, 6.57f, 6.0f, 9.03f, 6.0f, 12.0f);
        e.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        e.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        e.curveToRelative(0.0f, -1.66f, -0.67f, -3.16f, -1.76f, -4.24f);
        e.lineToRelative(-1.41f, 1.41f);
        e.curveTo(15.55f, 9.9f, 16.0f, 10.9f, 16.0f, 12.0f);
        e.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        e.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        e.curveToRelative(0.0f, -1.86f, 1.28f, -3.41f, 3.0f, -3.86f);
        e.verticalLineToRelative(2.14f);
        e.curveToRelative(-0.6f, 0.35f, -1.0f, 0.98f, -1.0f, 1.72f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        e.curveToRelative(0.0f, -0.74f, -0.4f, -1.38f, -1.0f, -1.72f);
        e.verticalLineTo(2.0f);
        e.horizontalLineToRelative(-1.0f);
        e.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        e.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        e.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        e.curveToRelative(0.0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _trackChanges = build;
        build.getClass();
        return build;
    }
}
