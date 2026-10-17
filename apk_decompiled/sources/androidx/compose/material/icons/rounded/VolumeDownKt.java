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
import defpackage.er;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolumeDownKt {
    private static ImageVector _volumeDown;

    public static final ImageVector getVolumeDown(Icons.Rounded rounded) {
        ImageVector imageVector = _volumeDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VolumeDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 12.0f);
        b.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        b.verticalLineToRelative(8.05f);
        b.curveToRelative(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
        bv.v(b, 5.0f, 10.0f, 4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(3.0f);
        b.lineToRelative(3.29f, 3.29f);
        b.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        b.verticalLineTo(6.41f);
        b.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        b.lineTo(9.0f, 9.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeDown = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getVolumeDown$annotations(Icons.Rounded rounded) {
    }
}
