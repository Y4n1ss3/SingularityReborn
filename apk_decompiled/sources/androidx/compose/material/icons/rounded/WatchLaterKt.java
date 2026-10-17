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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WatchLaterKt {
    private static ImageVector _watchLater;

    public static final ImageVector getWatchLater(Icons.Rounded rounded) {
        ImageVector imageVector = _watchLater;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WatchLater", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f);
        k4.x(b, 15.55f, 15.8f, -4.08f, -2.51f);
        b.curveToRelative(-0.3f, -0.18f, -0.48f, -0.5f, -0.48f, -0.85f);
        b.verticalLineTo(7.75f);
        b.curveTo(11.0f, 7.34f, 11.34f, 7.0f, 11.75f, 7.0f);
        b.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        b.verticalLineToRelative(4.45f);
        b.lineToRelative(3.84f, 2.31f);
        b.curveToRelative(0.36f, 0.22f, 0.48f, 0.69f, 0.26f, 1.05f);
        b.curveTo(16.38f, 15.91f, 15.91f, 16.02f, 15.55f, 15.8f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _watchLater = build;
        build.getClass();
        return build;
    }
}
