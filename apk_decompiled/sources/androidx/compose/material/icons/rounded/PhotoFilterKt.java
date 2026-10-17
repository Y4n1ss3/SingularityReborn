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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoFilterKt {
    private static ImageVector _photoFilter;

    public static final ImageVector getPhotoFilter(Icons.Rounded rounded) {
        ImageVector imageVector = _photoFilter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhotoFilter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.02f, 10.99f, 19.02f, 18.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.lineTo(6.0f, 19.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.lineTo(5.0f, 6.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(7.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        i.lineTo(5.02f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.lineTo(19.0f, 21.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        i.verticalLineToRelative(-8.01f);
        i.curveToRelative(0.0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f);
        i.reflectiveCurveToRelative(-0.99f, 0.44f, -0.99f, 0.99f);
        k4.r(i, 13.25f, 10.75f, 12.46f, 9.0f);
        i.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        i.lineToRelative(-0.79f, 1.75f);
        i.lineToRelative(-1.76f, 0.79f);
        i.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        i.lineToRelative(1.75f, 0.79f);
        i.lineToRelative(0.79f, 1.76f);
        i.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        i.lineToRelative(0.79f, -1.75f);
        i.lineToRelative(1.76f, -0.79f);
        i.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        fc.B(i, -1.75f, -0.8f, 17.94f, 6.06f);
        i.lineToRelative(-0.6f, -1.32f);
        i.curveToRelative(-0.13f, -0.29f, -0.55f, -0.29f, -0.69f, 0.0f);
        i.lineToRelative(-0.6f, 1.32f);
        i.lineToRelative(-1.32f, 0.6f);
        i.curveToRelative(-0.29f, 0.13f, -0.29f, 0.55f, 0.0f, 0.69f);
        i.lineToRelative(1.32f, 0.6f);
        i.lineToRelative(0.6f, 1.32f);
        i.curveToRelative(0.13f, 0.29f, 0.55f, 0.29f, 0.69f, 0.0f);
        i.lineToRelative(0.6f, -1.32f);
        i.lineToRelative(1.32f, -0.6f);
        i.curveToRelative(0.29f, -0.13f, 0.29f, -0.55f, 0.0f, -0.69f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(i, -1.32f, -0.6f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoFilter = build;
        build.getClass();
        return build;
    }
}
