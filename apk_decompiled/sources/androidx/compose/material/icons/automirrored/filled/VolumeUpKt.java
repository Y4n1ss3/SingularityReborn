package androidx.compose.material.icons.automirrored.filled;

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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolumeUpKt {
    private static ImageVector _volumeUp;

    public static final ImageVector getVolumeUp(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _volumeUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.VolumeUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(3.0f, 9.0f, 6.0f, 4.0f);
        m.lineToRelative(5.0f, 5.0f);
        m.lineTo(12.0f, 4.0f);
        r6.C(m, 7.0f, 9.0f, 3.0f, 9.0f);
        m.moveTo(16.5f, 12.0f);
        m.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        m.verticalLineToRelative(8.05f);
        m.curveToRelative(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
        bv.v(m, 14.0f, 3.23f, 2.06f);
        m.curveToRelative(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
        m.reflectiveCurveToRelative(-2.11f, 5.85f, -5.0f, 6.71f);
        m.verticalLineToRelative(2.06f);
        m.curveToRelative(4.01f, -0.91f, 7.0f, -4.49f, 7.0f, -8.77f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(m, -2.99f, -7.86f, -7.0f, -8.77f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeUp = build;
        build.getClass();
        return build;
    }
}
