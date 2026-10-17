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
import defpackage.bv;
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SaveAsKt {
    private static ImageVector _saveAs;

    public static final ImageVector getSaveAs(Icons.Filled filled) {
        ImageVector imageVector = _saveAs;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SaveAs", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = bv.i(21.0f, 12.4f, 7.0f, -4.0f, -4.0f);
        i.horizontalLineTo(5.0f);
        i.curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        gy.n(i, 7.4f, 21.0f, 12.4f);
        i.moveTo(15.0f, 15.0f);
        i.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        i.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        i.reflectiveCurveTo(15.0f, 13.34f, 15.0f, 15.0f);
        r6.B(i, 6.0f, 6.0f, 9.0f, 4.0f);
        bv.s(i, 6.0f, 6.0f, 19.99f, 16.25f);
        i.lineToRelative(1.77f, 1.77f);
        r6.w(i, 16.77f, 23.0f, 15.0f, -1.77f);
        uo.l(i, 19.99f, 16.25f, 23.25f, 16.51f);
        i.lineToRelative(-0.85f, 0.85f);
        i.lineToRelative(-1.77f, -1.77f);
        i.lineToRelative(0.85f, -0.85f);
        i.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        i.lineToRelative(1.06f, 1.06f);
        i.curveTo(23.45f, 16.0f, 23.45f, 16.32f, 23.25f, 16.51f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _saveAs = build;
        build.getClass();
        return build;
    }
}
