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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.Filled filled) {
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Camera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.4f, 10.5f, 4.77f, -8.26f);
        e.curveTo(13.47f, 2.09f, 12.75f, 2.0f, 12.0f, 2.0f);
        e.curveToRelative(-2.4f, 0.0f, -4.6f, 0.85f, -6.32f, 2.25f);
        fc.C(e, 3.66f, 6.35f, 0.06f, -0.1f);
        e.moveTo(21.54f, 9.0f);
        e.curveToRelative(-0.92f, -2.92f, -3.15f, -5.26f, -6.0f, -6.34f);
        uf.j(e, 11.88f, 9.0f, 9.66f);
        e.moveTo(21.8f, 10.0f);
        e.horizontalLineToRelative(-7.49f);
        e.lineToRelative(0.29f, 0.5f);
        e.lineToRelative(4.76f, 8.25f);
        e.curveTo(21.0f, 16.97f, 22.0f, 14.61f, 22.0f, 12.0f);
        e.curveToRelative(0.0f, -0.69f, -0.07f, -1.35f, -0.2f, -2.0f);
        k4.x(e, 8.54f, 12.0f, -3.9f, -6.75f);
        e.curveTo(3.01f, 7.03f, 2.0f, 9.39f, 2.0f, 12.0f);
        e.curveToRelative(0.0f, 0.69f, 0.07f, 1.35f, 0.2f, 2.0f);
        uo.w(e, 7.49f, -1.15f, -2.0f);
        e.moveTo(2.46f, 15.0f);
        e.curveToRelative(0.92f, 2.92f, 3.15f, 5.26f, 6.0f, 6.34f);
        r6.C(e, 12.12f, 15.0f, 2.46f, 15.0f);
        e.moveTo(13.73f, 15.0f);
        e.lineToRelative(-3.9f, 6.76f);
        e.curveToRelative(0.7f, 0.15f, 1.42f, 0.24f, 2.17f, 0.24f);
        e.curveToRelative(2.4f, 0.0f, 4.6f, -0.85f, 6.32f, -2.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -3.66f, -6.35f, -0.93f, 1.6f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _camera = build;
        build.getClass();
        return build;
    }
}
