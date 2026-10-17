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
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SyncProblemKt {
    private static ImageVector _syncProblem;

    public static final ImageVector getSyncProblem(Icons.Rounded rounded) {
        ImageVector imageVector = _syncProblem;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SyncProblem", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.0f, 12.0f);
        b.curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f);
        b.lineToRelative(-1.51f, 1.51f);
        b.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        b.lineTo(8.5f, 20.0f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b.verticalLineToRelative(-4.29f);
        b.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        b.lineToRelative(-1.39f, 1.39f);
        b.curveTo(5.68f, 15.15f, 5.0f, 13.66f, 5.0f, 12.0f);
        b.curveToRelative(0.0f, -2.39f, 1.4f, -4.46f, 3.43f, -5.42f);
        b.curveToRelative(0.34f, -0.16f, 0.57f, -0.47f, 0.57f, -0.84f);
        b.verticalLineToRelative(-0.19f);
        b.curveToRelative(0.0f, -0.68f, -0.71f, -1.11f, -1.32f, -0.82f);
        b.curveTo(4.92f, 5.99f, 3.0f, 8.77f, 3.0f, 12.0f);
        r6.B(b, 11.0f, 17.0f, 2.0f, -2.0f);
        fc.x(b, -2.0f, 2.0f, 19.79f, 4.0f);
        b.lineTo(15.5f, 4.0f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.verticalLineToRelative(4.29f);
        b.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        b.lineToRelative(1.39f, -1.39f);
        b.curveTo(18.32f, 8.85f, 19.0f, 10.34f, 19.0f, 12.0f);
        b.curveToRelative(0.0f, 2.39f, -1.4f, 4.46f, -3.43f, 5.42f);
        b.curveToRelative(-0.34f, 0.16f, -0.57f, 0.47f, -0.57f, 0.84f);
        b.verticalLineToRelative(0.18f);
        b.curveToRelative(0.0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f);
        b.curveTo(19.08f, 18.01f, 21.0f, 15.23f, 21.0f, 12.0f);
        b.curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f);
        b.lineToRelative(1.51f, -1.51f);
        b.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        b.close();
        b.moveTo(12.0f, 13.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.lineTo(13.0f, 8.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncProblem = build;
        build.getClass();
        return build;
    }
}
