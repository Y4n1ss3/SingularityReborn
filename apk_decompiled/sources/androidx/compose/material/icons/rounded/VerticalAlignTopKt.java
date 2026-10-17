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
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VerticalAlignTopKt {
    private static ImageVector _verticalAlignTop;

    public static final ImageVector getVerticalAlignTop(Icons.Rounded rounded) {
        ImageVector imageVector = _verticalAlignTop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VerticalAlignTop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(9.21f, 11.0f, 11.0f, 9.0f);
        q.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        q.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        q.verticalLineToRelative(-9.0f);
        q.horizontalLineToRelative(1.79f);
        q.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        q.lineToRelative(-2.79f, -2.79f);
        q.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        q.lineToRelative(-2.79f, 2.79f);
        q.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        q.close();
        q.moveTo(4.0f, 4.0f);
        q.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        q.horizontalLineToRelative(14.0f);
        q.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        q.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        q.horizontalLineTo(5.0f);
        q.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        q.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, q.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _verticalAlignTop = build;
        build.getClass();
        return build;
    }
}
