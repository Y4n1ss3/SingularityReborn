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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoFilterKt {
    private static ImageVector _photoFilter;

    public static final ImageVector getPhotoFilter(Icons.Outlined outlined) {
        ImageVector imageVector = _photoFilter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PhotoFilter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(19.0f, 10.0f, 9.0f, 4.98f, 19.0f);
        y.lineTo(4.98f, 5.0f);
        y.horizontalLineToRelative(9.0f);
        y.lineTo(13.98f, 3.0f);
        y.lineTo(5.0f, 3.0f);
        y.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        y.verticalLineToRelative(14.0f);
        y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y.horizontalLineToRelative(14.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kf0.C(y, -9.0f, -2.0f, 16.06f, 7.94f);
        y.lineTo(17.0f, 10.0f);
        y.lineToRelative(0.94f, -2.06f);
        y.lineTo(20.0f, 7.0f);
        y.lineToRelative(-2.06f, -0.94f);
        y.lineTo(17.0f, 4.0f);
        gy.B(y, -0.94f, 2.06f, 14.0f, 7.0f);
        y.moveTo(12.0f, 8.0f);
        y.lineToRelative(-1.25f, 2.75f);
        y.lineTo(8.0f, 12.0f);
        y.lineToRelative(2.75f, 1.25f);
        y.lineTo(12.0f, 16.0f);
        y.lineToRelative(1.25f, -2.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(y, 16.0f, 12.0f, -2.75f, -1.25f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoFilter = build;
        build.getClass();
        return build;
    }
}
