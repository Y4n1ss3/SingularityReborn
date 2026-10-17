package androidx.compose.foundation.text;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.d1;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicSecureTextField_androidKt {
    private static final ky DefaultContentResolverForSecureTextField;
    private static final String TAG = "BasicSecureTextField";
    private static ky contentResolverForSecureTextField;

    static {
        d1 d1Var = new d1(28);
        DefaultContentResolverForSecureTextField = d1Var;
        contentResolverForSecureTextField = d1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.BasicSecureTextField_androidKt$DefaultContentResolverForSecureTextField$1$1] */
    public static final BasicSecureTextField_androidKt$DefaultContentResolverForSecureTextField$1$1 DefaultContentResolverForSecureTextField$lambda$0(Context context) {
        final ContentResolver contentResolver = context.getContentResolver();
        return new ContentResolverForSecureTextField() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$DefaultContentResolverForSecureTextField$1$1
            @Override // androidx.compose.foundation.text.ContentResolverForSecureTextField
            public boolean getShowPassword() {
                try {
                    return Settings.System.getInt(contentResolver, "show_password") > 0;
                } catch (Exception e) {
                    Log.w("BasicSecureTextField", "Failed to fetch show password setting, using value: true", e);
                    return true;
                }
            }

            @Override // androidx.compose.foundation.text.ContentResolverForSecureTextField
            public void registerContentObserver(Uri uri, boolean z, ContentObserver contentObserver) {
                contentResolver.registerContentObserver(uri, z, contentObserver);
            }

            @Override // androidx.compose.foundation.text.ContentResolverForSecureTextField
            public void unregisterContentObserver(ContentObserver contentObserver) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
        };
    }

    public static final ky getContentResolverForSecureTextField() {
        return contentResolverForSecureTextField;
    }

    public static final boolean platformAllowsRevealLastTyped(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1015272320, i, -1, "androidx.compose.foundation.text.platformAllowsRevealLastTyped (BasicSecureTextField.android.kt:38)");
        }
        Object obj = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object obj2 = contentResolverForSecureTextField;
        boolean changed = composer.changed(obj2) | composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (ContentResolverForSecureTextField) contentResolverForSecureTextField.invoke(obj);
            composer.updateRememberedValue(rememberedValue);
        }
        final ContentResolverForSecureTextField contentResolverForSecureTextField2 = (ContentResolverForSecureTextField) rememberedValue;
        boolean changed2 = composer.changed(contentResolverForSecureTextField2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(contentResolverForSecureTextField2.getShowPassword()), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState = (MutableState) rememberedValue2;
        boolean changed3 = composer.changed(contentResolverForSecureTextField2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            final Handler createAsync = Handler.createAsync(Looper.getMainLooper());
            rememberedValue3 = new ContentObserver(createAsync) { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1
                @Override // android.database.ContentObserver
                public void onChange(boolean z) {
                    BasicSecureTextField_androidKt.platformAllowsRevealLastTyped$lambda$3(mutableState, ContentResolverForSecureTextField.this.getShowPassword());
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Object obj3 = (BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1) rememberedValue3;
        boolean changedInstance = composer.changedInstance(contentResolverForSecureTextField2) | composer.changedInstance(obj3);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new defpackage.g(4, contentResolverForSecureTextField2, obj3);
            composer.updateRememberedValue(rememberedValue4);
        }
        EffectsKt.DisposableEffect(contentResolverForSecureTextField2, obj3, (ky) rememberedValue4, composer, 0);
        boolean platformAllowsRevealLastTyped$lambda$2 = platformAllowsRevealLastTyped$lambda$2(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return platformAllowsRevealLastTyped$lambda$2;
    }

    private static final boolean platformAllowsRevealLastTyped$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void platformAllowsRevealLastTyped$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult platformAllowsRevealLastTyped$lambda$5$0(final ContentResolverForSecureTextField contentResolverForSecureTextField2, final BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1 basicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1, DisposableEffectScope disposableEffectScope) {
        contentResolverForSecureTextField2.registerContentObserver(Settings.System.getUriFor("show_password"), false, basicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1);
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$lambda$5$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ContentResolverForSecureTextField.this.unregisterContentObserver(basicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1);
            }
        };
    }

    public static final void resetContentResolverForSecureTextField() {
        contentResolverForSecureTextField = DefaultContentResolverForSecureTextField;
    }

    public static final void setContentResolverForSecureTextField(ky kyVar) {
        contentResolverForSecureTextField = kyVar;
    }

    public static /* synthetic */ void getContentResolverForSecureTextField$annotations() {
    }
}
