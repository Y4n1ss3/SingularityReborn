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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditLocationKt {
    private static ImageVector _editLocation;

    public static final ImageVector getEditLocation(Icons.Rounded rounded) {
        ImageVector imageVector = _editLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EditLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        b.curveToRelative(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f);
        b.curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f);
        b.curveTo(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f);
        b.curveTo(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f);
        uo.q(b, 9.73f, 13.5f, 8.5f, -1.44f);
        b.lineToRelative(3.93f, -3.92f);
        b.lineToRelative(1.43f, 1.43f);
        b.lineToRelative(-3.77f, 3.78f);
        b.curveTo(9.99f, 13.45f, 9.87f, 13.5f, 9.73f, 13.5f);
        k4.x(b, 15.28f, 8.16f, -0.7f, 0.7f);
        b.lineToRelative(-1.44f, -1.44f);
        b.lineToRelative(0.7f, -0.7f);
        b.curveToRelative(0.15f, -0.15f, 0.39f, -0.15f, 0.54f, 0.0f);
        b.lineToRelative(0.9f, 0.9f);
        b.curveTo(15.43f, 7.77f, 15.43f, 8.01f, 15.28f, 8.16f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocation = build;
        build.getClass();
        return build;
    }
}
