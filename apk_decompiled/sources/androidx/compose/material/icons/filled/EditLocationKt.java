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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditLocationKt {
    private static ImageVector _editLocation;

    public static final ImageVector getEditLocation(Icons.Filled filled) {
        ImageVector imageVector = _editLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EditLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f);
        b.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        b.reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f);
        b.curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f);
        k4.r(b, 10.44f, 12.0f, 9.0f, 12.0f);
        b.verticalLineToRelative(-1.44f);
        b.lineToRelative(3.35f, -3.34f);
        gy.B(b, 1.43f, 1.43f, 10.44f, 12.0f);
        b.moveTo(14.89f, 7.55f);
        b.lineToRelative(-0.7f, 0.7f);
        b.lineToRelative(-1.44f, -1.44f);
        b.lineToRelative(0.7f, -0.7f);
        b.curveToRelative(0.15f, -0.15f, 0.39f, -0.15f, 0.54f, 0.0f);
        b.lineToRelative(0.9f, 0.9f);
        b.curveToRelative(0.15f, 0.15f, 0.15f, 0.39f, 0.0f, 0.54f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocation = build;
        build.getClass();
        return build;
    }
}
