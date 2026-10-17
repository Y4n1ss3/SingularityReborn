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
import defpackage.bv;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolumeUpKt {
    private static ImageVector _volumeUp;

    public static final ImageVector getVolumeUp(Icons.Rounded rounded) {
        ImageVector imageVector = _volumeUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VolumeUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(3.0f, 10.0f, 4.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.horizontalLineToRelative(3.0f);
        h.lineToRelative(3.29f, 3.29f);
        h.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        h.lineTo(12.0f, 6.41f);
        h.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        h.lineTo(7.0f, 9.0f);
        h.lineTo(4.0f, 9.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        h.close();
        h.moveTo(16.5f, 12.0f);
        h.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        h.verticalLineToRelative(8.05f);
        h.curveToRelative(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
        bv.v(h, 14.0f, 4.45f, 0.2f);
        h.curveToRelative(0.0f, 0.38f, 0.25f, 0.71f, 0.6f, 0.85f);
        h.curveTo(17.18f, 6.53f, 19.0f, 9.06f, 19.0f, 12.0f);
        h.reflectiveCurveToRelative(-1.82f, 5.47f, -4.4f, 6.5f);
        h.curveToRelative(-0.36f, 0.14f, -0.6f, 0.47f, -0.6f, 0.85f);
        h.verticalLineToRelative(0.2f);
        h.curveToRelative(0.0f, 0.63f, 0.63f, 1.07f, 1.21f, 0.85f);
        h.curveTo(18.6f, 19.11f, 21.0f, 15.84f, 21.0f, 12.0f);
        h.reflectiveCurveToRelative(-2.4f, -7.11f, -5.79f, -8.4f);
        h.curveToRelative(-0.58f, -0.23f, -1.21f, 0.22f, -1.21f, 0.85f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeUp = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getVolumeUp$annotations(Icons.Rounded rounded) {
    }
}
