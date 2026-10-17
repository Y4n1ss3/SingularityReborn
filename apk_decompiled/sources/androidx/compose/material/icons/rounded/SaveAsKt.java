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
import defpackage.bv;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SaveAsKt {
    private static ImageVector _saveAs;

    public static final ImageVector getSaveAs(Icons.Rounded rounded) {
        ImageVector imageVector = _saveAs;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SaveAs", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.41f, 6.41f, -2.83f, -2.83f);
        e.curveTo(17.21f, 3.21f, 16.7f, 3.0f, 16.17f, 3.0f);
        e.horizontalLineTo(5.0f);
        e.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        e.verticalLineToRelative(14.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kp0.q(e, 7.4f, 8.6f, -8.6f, 7.83f);
        e.curveTo(21.0f, 7.3f, 20.79f, 6.79f, 20.41f, 6.41f);
        e.close();
        e.moveTo(12.0f, 18.0f);
        e.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        e.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        e.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        e.reflectiveCurveTo(13.66f, 18.0f, 12.0f, 18.0f);
        e.close();
        e.moveTo(15.0f, 9.0f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.horizontalLineTo(7.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.verticalLineTo(7.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineToRelative(7.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bv.t(e, 9.0f, 19.99f, 16.25f);
        e.lineToRelative(1.77f, 1.77f);
        e.lineToRelative(-4.84f, 4.84f);
        e.curveTo(16.82f, 22.95f, 16.69f, 23.0f, 16.56f, 23.0f);
        e.horizontalLineTo(15.5f);
        e.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        e.verticalLineToRelative(-1.06f);
        e.curveToRelative(0.0f, -0.13f, 0.05f, -0.26f, 0.15f, -0.35f);
        uo.l(e, 19.99f, 16.25f, 23.25f, 16.51f);
        e.lineToRelative(-0.85f, 0.85f);
        e.lineToRelative(-1.77f, -1.77f);
        e.lineToRelative(0.85f, -0.85f);
        e.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        e.lineToRelative(1.06f, 1.06f);
        e.curveTo(23.45f, 16.0f, 23.45f, 16.32f, 23.25f, 16.51f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _saveAs = build;
        build.getClass();
        return build;
    }
}
