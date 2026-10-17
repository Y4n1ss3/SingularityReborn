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
import defpackage.bv;
import defpackage.gy;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CropRotateKt {
    private static ImageVector _cropRotate;

    public static final ImageVector getCropRotate(Icons.Filled filled) {
        ImageVector imageVector = _cropRotate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CropRotate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.47f, 21.49f);
        b.curveTo(4.2f, 19.93f, 1.86f, 16.76f, 1.5f, 13.0f);
        b.lineTo(0.0f, 13.0f);
        b.curveToRelative(0.51f, 6.16f, 5.66f, 11.0f, 11.95f, 11.0f);
        b.curveToRelative(0.23f, 0.0f, 0.44f, -0.02f, 0.66f, -0.03f);
        bv.o(b, 8.8f, 20.15f, -1.33f, 1.34f);
        b.moveTo(12.05f, 0.0f);
        b.curveToRelative(-0.23f, 0.0f, -0.44f, 0.02f, -0.66f, 0.04f);
        b.lineToRelative(3.81f, 3.81f);
        b.lineToRelative(1.33f, -1.33f);
        b.curveTo(19.8f, 4.07f, 22.14f, 7.24f, 22.5f, 11.0f);
        b.lineTo(24.0f, 11.0f);
        b.curveToRelative(-0.51f, -6.16f, -5.66f, -11.0f, -11.95f, -11.0f);
        af0.l(b, 16.0f, 14.0f, 2.0f);
        b.lineTo(18.0f, 8.0f);
        b.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        gy.D(b, -6.0f, 2.0f, 6.0f, 6.0f);
        b.moveTo(8.0f, 16.0f);
        b.lineTo(8.0f, 4.0f);
        b.lineTo(6.0f, 4.0f);
        bv.q(b, 2.0f, 4.0f, 6.0f, 2.0f);
        b.horizontalLineToRelative(2.0f);
        b.verticalLineToRelative(8.0f);
        b.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        af0.v(b, 8.0f, 2.0f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.h(b, 2.0f, -2.0f, 8.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cropRotate = build;
        build.getClass();
        return build;
    }
}
