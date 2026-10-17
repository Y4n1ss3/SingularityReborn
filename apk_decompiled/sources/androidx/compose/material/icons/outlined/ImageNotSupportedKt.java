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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageNotSupportedKt {
    private static ImageVector _imageNotSupported;

    public static final ImageVector getImageNotSupported(Icons.Outlined outlined) {
        ImageVector imageVector = _imageNotSupported;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ImageNotSupported", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.9f, 21.9f, -6.1f, -6.1f);
        e.lineToRelative(-2.69f, -2.69f);
        e.lineToRelative(0.0f, 0.0f);
        e.lineTo(5.0f, 5.0f);
        e.lineToRelative(0.0f, 0.0f);
        e.lineTo(3.59f, 3.59f);
        e.lineToRelative(0.0f, 0.0f);
        e.lineTo(2.1f, 2.1f);
        e.lineTo(0.69f, 3.51f);
        e.lineTo(3.0f, 5.83f);
        e.verticalLineTo(19.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(13.17f);
        gy.B(e, 2.31f, 2.31f, 21.9f, 21.9f);
        e.moveTo(5.0f, 19.0f);
        e.verticalLineTo(7.83f);
        e.lineToRelative(6.84f, 6.84f);
        e.lineTo(11.0f, 15.72f);
        e.lineTo(9.0f, 13.0f);
        e.lineToRelative(-3.0f, 4.0f);
        uf.A(e, 8.17f, 2.0f, 2.0f, 5.0f);
        e.moveTo(7.83f, 5.0f);
        e.lineToRelative(-2.0f, -2.0f);
        e.horizontalLineTo(19.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        k4.z(e, 13.17f, -2.0f, -2.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(e, 7.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageNotSupported = build;
        build.getClass();
        return build;
    }
}
