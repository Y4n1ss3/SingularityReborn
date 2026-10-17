package androidx.compose.material.icons.filled;

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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HeadsetOffKt {
    private static ImageVector _headsetOff;

    public static final ImageVector getHeadsetOff(Icons.Filled filled) {
        ImageVector imageVector = _headsetOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HeadsetOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        uo.B(b, 2.0f, -2.92f, 21.0f, 17.92f);
        b.verticalLineTo(11.0f);
        b.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        b.curveToRelative(-1.95f, 0.0f, -3.76f, 0.62f, -5.23f, 1.68f);
        b.lineToRelative(1.44f, 1.44f);
        b.curveTo(9.3f, 4.41f, 10.6f, 4.0f, 12.0f, 4.0f);
        k4.r(b, 2.27f, 1.72f, 1.0f, 3.0f);
        b.lineToRelative(3.33f, 3.32f);
        b.curveTo(3.49f, 7.68f, 3.0f, 9.29f, 3.0f, 11.0f);
        b.verticalLineToRelative(7.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        af0.z(b, 3.0f, -8.0f, 5.0f, -2.0f);
        b.curveToRelative(0.0f, -1.17f, 0.29f, -2.26f, 0.79f, -3.22f);
        af0.m(b, 15.0f, 17.0f, 4.0f, 3.0f);
        b.curveToRelative(0.3f, 0.0f, 0.59f, -0.06f, 0.86f, -0.14f);
        b.lineTo(21.0f, 23.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 1.27f, -1.27f, -20.0f, -20.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _headsetOff = build;
        build.getClass();
        return build;
    }
}
