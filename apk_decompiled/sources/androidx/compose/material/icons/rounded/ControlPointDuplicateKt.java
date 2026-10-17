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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ControlPointDuplicateKt {
    private static ImageVector _controlPointDuplicate;

    public static final ImageVector getControlPointDuplicate(Icons.Rounded rounded) {
        ImageVector imageVector = _controlPointDuplicate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ControlPointDuplicate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 8.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(2.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-2.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-2.0f);
        b.lineTo(16.0f, 9.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.close();
        b.moveTo(2.0f, 12.0f);
        b.curveToRelative(0.0f, -2.58f, 1.4f, -4.83f, 3.48f, -6.04f);
        b.curveToRelative(0.32f, -0.19f, 0.53f, -0.51f, 0.53f, -0.88f);
        b.curveToRelative(0.0f, -0.77f, -0.84f, -1.25f, -1.51f, -0.86f);
        b.curveTo(1.82f, 5.78f, 0.0f, 8.68f, 0.0f, 12.0f);
        b.reflectiveCurveToRelative(1.82f, 6.22f, 4.5f, 7.78f);
        b.curveToRelative(0.67f, 0.39f, 1.51f, -0.09f, 1.51f, -0.86f);
        b.curveToRelative(0.0f, -0.37f, -0.21f, -0.69f, -0.53f, -0.88f);
        b.curveTo(3.4f, 16.83f, 2.0f, 14.58f, 2.0f, 12.0f);
        b.close();
        b.moveTo(15.0f, 3.0f);
        b.curveToRelative(-4.96f, 0.0f, -9.0f, 4.04f, -9.0f, 9.0f);
        b.reflectiveCurveToRelative(4.04f, 9.0f, 9.0f, 9.0f);
        b.reflectiveCurveToRelative(9.0f, -4.04f, 9.0f, -9.0f);
        b.reflectiveCurveToRelative(-4.04f, -9.0f, -9.0f, -9.0f);
        b.close();
        b.moveTo(15.0f, 19.0f);
        b.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        b.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        b.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -3.14f, 7.0f, -7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _controlPointDuplicate = build;
        build.getClass();
        return build;
    }
}
