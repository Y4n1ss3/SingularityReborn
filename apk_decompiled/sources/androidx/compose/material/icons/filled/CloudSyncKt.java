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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CloudSyncKt {
    private static ImageVector _cloudSync;

    public static final ImageVector getCloudSync(Icons.Filled filled) {
        ImageVector imageVector = _cloudSync;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CloudSync", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.5f, 14.98f);
        b.curveToRelative(-0.02f, 0.0f, -0.03f, 0.0f, -0.05f, 0.01f);
        b.curveTo(21.2f, 13.3f, 19.76f, 12.0f, 18.0f, 12.0f);
        b.curveToRelative(-1.4f, 0.0f, -2.6f, 0.83f, -3.16f, 2.02f);
        b.curveTo(13.26f, 14.1f, 12.0f, 15.4f, 12.0f, 17.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.lineToRelative(6.5f, -0.02f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        b.reflectiveCurveTo(22.88f, 14.98f, 21.5f, 14.98f);
        bv.v(b, 10.0f, 4.26f, 2.09f);
        b.curveTo(7.67f, 7.18f, 6.0f, 9.39f, 6.0f, 12.0f);
        b.curveToRelative(0.0f, 1.77f, 0.78f, 3.34f, 2.0f, 4.44f);
        j50.B(b, 14.0f, 2.0f, 6.0f, 4.0f);
        b.verticalLineToRelative(-2.0f);
        b.horizontalLineToRelative(2.73f);
        b.curveTo(5.06f, 16.54f, 4.0f, 14.4f, 4.0f, 12.0f);
        b.curveTo(4.0f, 8.27f, 6.55f, 5.15f, 10.0f, 4.26f);
        af0.l(b, 20.0f, 6.0f, -2.73f);
        b.curveToRelative(1.43f, 1.26f, 2.41f, 3.01f, 2.66f, 5.0f);
        b.lineToRelative(-2.02f, 0.0f);
        b.curveTo(17.68f, 9.64f, 16.98f, 8.45f, 16.0f, 7.56f);
        gy.z(b, 10.0f, -2.0f, 4.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudSync = build;
        build.getClass();
        return build;
    }
}
