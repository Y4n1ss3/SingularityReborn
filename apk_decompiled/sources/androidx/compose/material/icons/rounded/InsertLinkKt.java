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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InsertLinkKt {
    private static ImageVector _insertLink;

    public static final ImageVector getInsertLink(Icons.Rounded rounded) {
        ImageVector imageVector = _insertLink;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.InsertLink", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.96f, 11.38f);
        b.curveTo(4.24f, 9.91f, 5.62f, 8.9f, 7.12f, 8.9f);
        b.horizontalLineToRelative(2.93f);
        b.curveToRelative(0.52f, 0.0f, 0.95f, -0.43f, 0.95f, -0.95f);
        b.reflectiveCurveTo(10.57f, 7.0f, 10.05f, 7.0f);
        b.lineTo(7.22f, 7.0f);
        b.curveToRelative(-2.61f, 0.0f, -4.94f, 1.91f, -5.19f, 4.51f);
        b.curveTo(1.74f, 14.49f, 4.08f, 17.0f, 7.0f, 17.0f);
        b.horizontalLineToRelative(3.05f);
        b.curveToRelative(0.52f, 0.0f, 0.95f, -0.43f, 0.95f, -0.95f);
        b.reflectiveCurveToRelative(-0.43f, -0.95f, -0.95f, -0.95f);
        b.lineTo(7.0f, 15.1f);
        b.curveToRelative(-1.91f, 0.0f, -3.42f, -1.74f, -3.04f, -3.72f);
        af0.l(b, 9.0f, 13.0f, 6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(9.0f, 11.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        af0.l(b, 16.78f, 7.0f, -2.83f);
        b.curveToRelative(-0.52f, 0.0f, -0.95f, 0.43f, -0.95f, 0.95f);
        b.reflectiveCurveToRelative(0.43f, 0.95f, 0.95f, 0.95f);
        b.horizontalLineToRelative(2.93f);
        b.curveToRelative(1.5f, 0.0f, 2.88f, 1.01f, 3.16f, 2.48f);
        b.curveToRelative(0.38f, 1.98f, -1.13f, 3.72f, -3.04f, 3.72f);
        b.horizontalLineToRelative(-3.05f);
        b.curveToRelative(-0.52f, 0.0f, -0.95f, 0.43f, -0.95f, 0.95f);
        b.reflectiveCurveToRelative(0.43f, 0.95f, 0.95f, 0.95f);
        b.lineTo(17.0f, 17.0f);
        b.curveToRelative(2.92f, 0.0f, 5.26f, -2.51f, 4.98f, -5.49f);
        b.curveToRelative(-0.25f, -2.6f, -2.59f, -4.51f, -5.2f, -4.51f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _insertLink = build;
        build.getClass();
        return build;
    }
}
