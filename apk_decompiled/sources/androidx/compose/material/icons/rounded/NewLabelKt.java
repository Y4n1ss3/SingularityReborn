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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NewLabelKt {
    private static ImageVector _newLabel;

    public static final ImageVector getNewLabel(Icons.Rounded rounded) {
        ImageVector imageVector = _newLabel;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NewLabel", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.18f, 13.16f, -3.55f, 5.0f);
        e.curveTo(16.25f, 18.69f, 15.65f, 19.0f, 15.0f, 19.0f);
        e.horizontalLineToRelative(-3.0f);
        e.lineToRelative(0.0f, -2.0f);
        e.lineToRelative(0.0f, -1.0f);
        e.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        e.horizontalLineToRelative(0.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        e.horizontalLineTo(3.0f);
        e.verticalLineTo(7.0f);
        e.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        e.horizontalLineToRelative(10.0f);
        e.curveToRelative(0.65f, 0.0f, 1.26f, 0.31f, 1.63f, 0.84f);
        e.lineToRelative(3.55f, 5.0f);
        e.curveTo(20.67f, 11.54f, 20.67f, 12.46f, 20.18f, 13.16f);
        e.close();
        e.moveTo(10.0f, 16.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineTo(7.0f);
        e.verticalLineToRelative(-2.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(2.0f);
        e.horizontalLineTo(3.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(2.0f);
        e.verticalLineToRelative(2.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(-2.0f);
        e.horizontalLineToRelative(2.0f);
        e.curveTo(9.55f, 17.0f, 10.0f, 16.55f, 10.0f, 16.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _newLabel = build;
        build.getClass();
        return build;
    }
}
