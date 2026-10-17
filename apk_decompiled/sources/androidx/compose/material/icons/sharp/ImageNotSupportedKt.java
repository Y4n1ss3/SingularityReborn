package androidx.compose.material.icons.sharp;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageNotSupportedKt {
    private static ImageVector _imageNotSupported;

    public static final ImageVector getImageNotSupported(Icons.Sharp sharp) {
        ImageVector imageVector = _imageNotSupported;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ImageNotSupported", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.9f, 21.9f, -8.49f, -8.49f);
        e.lineToRelative(0.0f, 0.0f);
        e.lineTo(3.0f, 3.0f);
        e.lineToRelative(0.0f, 0.0f);
        e.lineTo(2.1f, 2.1f);
        e.lineTo(0.69f, 3.51f);
        fc.t(e, 3.0f, 5.83f, 21.0f, 15.17f);
        gy.B(e, 2.31f, 2.31f, 21.9f, 21.9f);
        e.moveTo(5.0f, 18.0f);
        e.lineToRelative(3.5f, -4.5f);
        e.lineToRelative(2.5f, 3.01f);
        e.lineTo(12.17f, 15.0f);
        gy.w(e, 3.0f, 3.0f, 5.0f);
        e.moveTo(21.0f, 18.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(e, 5.83f, 3.0f, 21.0f, 18.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageNotSupported = build;
        build.getClass();
        return build;
    }
}
