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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImportExportKt {
    private static ImageVector _importExport;

    public static final ImageVector getImportExport(Icons.Rounded rounded) {
        ImageVector imageVector = _importExport;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ImportExport", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(8.65f, 3.35f, 5.86f, 6.14f);
        i.curveToRelative(-0.32f, 0.31f, -0.1f, 0.85f, 0.35f, 0.85f);
        i.horizontalLineTo(8.0f);
        i.verticalLineTo(13.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineTo(6.99f);
        i.horizontalLineToRelative(1.79f);
        i.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        i.lineTo(9.35f, 3.35f);
        i.curveToRelative(-0.19f, -0.19f, -0.51f, -0.19f, -0.7f, 0.0f);
        bv.g(i, 16.0f, 17.01f, 11.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(6.01f);
        i.horizontalLineToRelative(-1.79f);
        i.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        i.lineToRelative(2.79f, 2.78f);
        i.curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0.0f);
        i.lineToRelative(2.79f, -2.78f);
        i.curveToRelative(0.32f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _importExport = build;
        build.getClass();
        return build;
    }
}
