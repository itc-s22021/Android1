// Generated by view binder compiler. Do not edit!
package jp.ac.it_college.std.s22021.fragmentsample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.Override;
import jp.ac.it_college.std.s22021.fragmentsample.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-xlarge/</li>
   * </ul>
   */
  @Nullable
  public final FragmentContainerView fragmentMainContainer;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @Nullable FragmentContainerView fragmentMainContainer) {
    this.rootView = rootView;
    this.fragmentMainContainer = fragmentMainContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    FragmentContainerView fragmentMainContainer = ViewBindings.findChildViewById(rootView, R.id.fragmentMainContainer);

    return new ActivityMainBinding((ConstraintLayout) rootView, fragmentMainContainer);
  }
}