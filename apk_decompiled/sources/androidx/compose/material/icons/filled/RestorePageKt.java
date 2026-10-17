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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RestorePageKt {
    private static ImageVector _restorePage;

    public static final ImageVector getRestorePage(Icons.Filled filled) {
        ImageVector imageVector = _restorePage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RestorePage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.0f, 2.0f, 6.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        i.lineTo(4.0f, 20.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        i.lineTo(18.0f, 22.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.o(i, 20.0f, 8.0f, -6.0f, -6.0f);
        i.moveTo(12.0f, 18.0f);
        i.curveToRelative(-2.05f, 0.0f, -3.81f, -1.24f, -4.58f, -3.0f);
        i.horizontalLineToRelative(1.71f);
        i.curveToRelative(0.63f, 0.9f, 1.68f, 1.5f, 2.87f, 1.5f);
        i.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        i.reflectiveCurveTo(13.93f, 9.5f, 12.0f, 9.5f);
        i.curveToRelative(-1.35f, 0.0f, -2.52f, 0.78f, -3.1f, 1.9f);
        i.lineToRelative(1.6f, 1.6f);
        i.horizontalLineToRelative(-4.0f);
        i.lineTo(6.5f, 9.0f);
        i.lineToRelative(1.3f, 1.3f);
        i.curveTo(8.69f, 8.92f, 10.23f, 8.0f, 12.0f, 8.0f);
        i.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -2.24f, 5.0f, -5.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restorePage = build;
        build.getClass();
        return build;
    }
}
