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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilePresentKt {
    private static ImageVector _filePresent;

    public static final ImageVector getFilePresent(Icons.Filled filled) {
        ImageVector imageVector = _filePresent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FilePresent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.0f, 2.0f, 6.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(16.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(12.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.o(i, 20.0f, 7.0f, -5.0f, -5.0f);
        i.moveTo(6.0f, 20.0f);
        fc.w(i, 6.0f, 4.0f, 8.0f, 4.0f);
        j50.o(i, 4.0f, 12.0f, 6.0f, 20.0f);
        i.moveTo(16.0f, 10.0f);
        i.verticalLineToRelative(5.0f);
        i.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        i.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        i.lineTo(8.0f, 8.5f);
        i.curveToRelative(0.0f, -1.47f, 1.26f, -2.64f, 2.76f, -2.49f);
        i.curveToRelative(1.3f, 0.13f, 2.24f, 1.32f, 2.24f, 2.63f);
        i.lineTo(13.0f, 15.0f);
        i.horizontalLineToRelative(-2.0f);
        i.lineTo(11.0f, 8.5f);
        i.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        i.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        i.lineTo(10.0f, 15.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(i, -5.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filePresent = build;
        build.getClass();
        return build;
    }
}
