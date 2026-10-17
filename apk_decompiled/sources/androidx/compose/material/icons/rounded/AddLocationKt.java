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
public final class AddLocationKt {
    private static ImageVector _addLocation;

    public static final ImageVector getAddLocation(Icons.Rounded rounded) {
        ImageVector imageVector = _addLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.0f, 7.0f);
        b.curveToRelative(0.0f, -0.55f, -0.44f, -1.0f, -1.0f, -1.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.44f, -1.0f, 1.0f);
        b.verticalLineToRelative(2.0f);
        b.horizontalLineTo(9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.44f, -1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.44f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.55f, 0.44f, 1.0f, 1.0f, 1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.44f, 1.0f, -1.0f);
        b.verticalLineToRelative(-2.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.44f, 1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, -0.44f, -1.0f, -1.0f, -1.0f);
        uo.r(b, -2.0f, 7.0f, 12.0f, 2.0f);
        b.curveToRelative(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f);
        b.curveToRelative(0.0f, 3.18f, -2.45f, 6.92f, -7.34f, 11.23f);
        b.curveToRelative(-0.38f, 0.33f, -0.95f, 0.33f, -1.33f, 0.0f);
        b.curveTo(6.45f, 17.12f, 4.0f, 13.38f, 4.0f, 10.2f);
        b.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLocation = build;
        build.getClass();
        return build;
    }
}
