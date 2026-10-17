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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilePresentKt {
    private static ImageVector _filePresent;

    public static final ImageVector getFilePresent(Icons.Sharp sharp) {
        ImageVector imageVector = _filePresent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FilePresent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(14.0f, 2.0f, 4.0f, 20.0f, 16.0f);
        bv.k(i, 8.0f, 14.0f, 2.0f);
        i.moveTo(16.0f, 15.0f);
        i.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        i.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        i.verticalLineTo(9.5f);
        i.curveTo(8.0f, 8.12f, 9.12f, 7.0f, 10.5f, 7.0f);
        i.reflectiveCurveTo(13.0f, 8.12f, 13.0f, 9.5f);
        uf.z(i, 15.0f, -2.0f, 9.5f);
        i.curveTo(11.0f, 9.22f, 10.78f, 9.0f, 10.5f, 9.0f);
        i.reflectiveCurveTo(10.0f, 9.22f, 10.0f, 9.5f);
        i.verticalLineTo(15.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        k4.p(i, -4.0f, 2.0f, 15.0f);
        i.moveTo(14.0f, 8.0f);
        i.verticalLineTo(4.0f);
        i.lineToRelative(4.0f, 4.0f);
        i.horizontalLineTo(14.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filePresent = build;
        build.getClass();
        return build;
    }
}
