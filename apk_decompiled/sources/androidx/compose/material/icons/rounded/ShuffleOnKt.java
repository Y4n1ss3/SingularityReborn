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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShuffleOnKt {
    private static ImageVector _shuffleOn;

    public static final ImageVector getShuffleOn(Icons.Rounded rounded) {
        ImageVector imageVector = _shuffleOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ShuffleOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(21.0f, 1.0f, 3.0f);
        d.curveTo(1.9f, 1.0f, 1.0f, 1.9f, 1.0f, 3.0f);
        d.verticalLineToRelative(18.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(18.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(3.0f);
        d.curveTo(23.0f, 1.9f, 22.1f, 1.0f, 21.0f, 1.0f);
        d.close();
        d.moveTo(4.3f, 4.7f);
        d.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        d.lineToRelative(4.47f, 4.47f);
        d.lineToRelative(-1.42f, 1.4f);
        d.lineTo(4.3f, 6.11f);
        d.curveTo(3.91f, 5.72f, 3.91f, 5.09f, 4.3f, 4.7f);
        d.close();
        d.moveTo(19.59f, 19.5f);
        d.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        d.horizontalLineTo(15.3f);
        d.curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.36f, -0.85f);
        d.lineToRelative(1.2f, -1.2f);
        d.lineToRelative(-3.13f, -3.13f);
        d.lineToRelative(1.41f, -1.41f);
        d.lineToRelative(3.13f, 3.14f);
        d.lineToRelative(1.19f, -1.19f);
        d.curveToRelative(0.31f, -0.32f, 0.85f, -0.1f, 0.85f, 0.35f);
        bv.t(d, 19.5f, 19.59f, 8.29f);
        d.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.36f);
        d.lineToRelative(-1.19f, -1.19f);
        d.lineTo(5.7f, 19.29f);
        d.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        d.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        d.lineTo(16.13f, 6.04f);
        d.lineToRelative(-1.19f, -1.19f);
        d.curveTo(14.63f, 4.54f, 14.85f, 4.0f, 15.3f, 4.0f);
        d.horizontalLineToRelative(3.79f);
        d.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 8.29f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shuffleOn = build;
        build.getClass();
        return build;
    }
}
